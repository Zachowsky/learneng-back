package com.thesis.learnengback.rest;

import com.thesis.learnengback.database.repository.TensesRepository;
import com.thesis.learnengback.transport.converter.TensesConv;
import com.thesis.learnengback.transport.dto.TensesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tenses")
public class TensesController {

    private TensesRepository tensesRepository;

    @Autowired
    public TensesController(TensesRepository tensesRepository) {
        this.tensesRepository = tensesRepository;
    }

    @GetMapping(value = "/{tense}")
    public ResponseEntity<List<TensesDTO>> getAllTenseExamples(@PathVariable String tense){

        List<TensesDTO> tensesDTOS = tensesRepository.findAllByTense(tense).stream().map(TensesConv::toDTO).collect(Collectors.toList());
        Collections.shuffle(tensesDTOS);
        return ResponseEntity.ok(tensesDTOS);
    }
}
