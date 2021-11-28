package com.thesis.learnengback.rest;

import com.thesis.learnengback.service.NLPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start-ex")
public class StartController {

    private NLPService nlpService;

    @Autowired
    public StartController(NLPService nlpService) {
        this.nlpService = nlpService;
    }

    @GetMapping("/{word}")
    public ResponseEntity<String> checkIfVerb(@PathVariable String word){

        String output = nlpService.getPoS(word);
        return ResponseEntity.ok(output);
    }
}
