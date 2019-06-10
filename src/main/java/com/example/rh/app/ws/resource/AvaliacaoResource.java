package com.example.rh.app.ws.resource;

import com.example.rh.app.ws.event.RecursoCriadoEvent;
import com.example.rh.app.ws.model.Avaliacao;
import com.example.rh.app.ws.model.Competencia;
import com.example.rh.app.ws.repository.AvaliacaoRepository;
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
@RequestMapping("/avaliacao")
public class AvaliacaoResource {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public List<Avaliacao> listar () {
        return avaliacaoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Avaliacao> criar (
            @Valid @RequestBody Avaliacao avaliacao, HttpServletResponse response ) {
        Avaliacao avaliacaoSalva = avaliacaoRepository.save(avaliacao);

        publisher.publishEvent(new RecursoCriadoEvent(this, response, avaliacaoSalva.getId()));

        return ResponseEntity.status(HttpStatus.CREATED).body(avaliacaoSalva);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Avaliacao> buscarPorId(@PathVariable Long id) {
        Avaliacao avaliacao = avaliacaoRepository.findOne(id);
        return avaliacao != null ? ResponseEntity.ok(avaliacao) : ResponseEntity.notFound().build();
    }

}
