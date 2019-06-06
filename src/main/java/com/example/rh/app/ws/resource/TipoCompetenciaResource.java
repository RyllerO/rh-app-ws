package com.example.rh.app.ws.resource;

import com.example.rh.app.ws.event.RecursoCriadoEvent;
import com.example.rh.app.ws.model.TipoCompetencia;
import com.example.rh.app.ws.repository.TipoCompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * @author Ryller Oliveira
 */
@RestController
@RequestMapping("/tipo-competencia")
public class TipoCompetenciaResource {

    @Autowired
    private TipoCompetenciaRepository tipoCompetenciaRepository;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public List<TipoCompetencia> listar (){
        return tipoCompetenciaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<TipoCompetencia> criar (
            @Valid @RequestBody TipoCompetencia tipo, HttpServletResponse response ) {
        TipoCompetencia tipoSalvo = tipoCompetenciaRepository.save(tipo);

        publisher.publishEvent(new RecursoCriadoEvent(this, response, tipoSalvo.getId()));

        return ResponseEntity.status(HttpStatus.CREATED).body(tipoSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoCompetencia> buscarPorId(@PathVariable Long id) {
        TipoCompetencia tipo = tipoCompetenciaRepository.findOne(id);
        return tipo != null ? ResponseEntity.ok(tipo) : ResponseEntity.notFound().build();
    }

}
