package com.thesis.learnengback.rest;

import com.thesis.learnengback.database.repository.TranslationRepository;
import com.thesis.learnengback.transport.converter.TranslationConv;
import com.thesis.learnengback.transport.dto.TranslationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dashboard")
public class TranslationController {

    private TranslationRepository translationRepository;

    @Autowired
    public TranslationController(TranslationRepository translationRepository) {
        this.translationRepository = translationRepository;
    }

    @GetMapping(value = "/{tense}")
    public ResponseEntity<List<TranslationDTO>> getAllTranslations(@PathVariable String tense){

        List<TranslationDTO> translationDTOS = translationRepository.findAllByTense(tense).stream().map(TranslationConv::toDTO).collect(Collectors.toList());

        return ResponseEntity.ok(translationDTOS);
    }

}
