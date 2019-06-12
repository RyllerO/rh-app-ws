package com.example.rh.app.ws.resource;

import com.example.rh.app.ws.event.RecursoCriadoEvent;
import com.example.rh.app.ws.model.Competencia;
import com.example.rh.app.ws.repository.CompetenciaRepository;
import org.springframework.beans.BeanUtils;
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
@RequestMapping("/competencias")
public class CompetenciaResource {

    @Autowired
    private CompetenciaRepository competenciaRepository;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public List<Competencia> listar () {
        return competenciaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Competencia> criar (
            @Valid @RequestBody Competencia competencia, HttpServletResponse response ) {
        Competencia competenciaSalva = competenciaRepository.save(competencia);

        publisher.publishEvent(new RecursoCriadoEvent(this, response, competenciaSalva.getId()));

        return ResponseEntity.status(HttpStatus.CREATED).body(competenciaSalva);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Competencia> buscarPorId(@PathVariable Long id) {
        Competencia competencia = competenciaRepository.findOne(id);
        return competencia != null ? ResponseEntity.ok(competencia) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover (@PathVariable Long id) {
        competenciaRepository.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Competencia> atualizar(@PathVariable Long id, @Valid @RequestBody Competencia competencia) {
        Competencia competenciaSalva = competenciaRepository.findOne(id);
        BeanUtils.copyProperties(competencia, competenciaSalva, "id");
        competenciaRepository.save(competenciaSalva);
        return ResponseEntity.ok(competenciaSalva);
    }
}
