package com.thesis.learnengback.rest;

import com.thesis.learnengback.service.NLPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/personal-pronouns-ex")
public class PersonalPronounsController {

    private NLPService nlpService;

    @Autowired
    public PersonalPronounsController(NLPService nlpService) {
        this.nlpService = nlpService;
    }

    @GetMapping("/{word}")
    public ResponseEntity<String> checkIfPronoun(@PathVariable String word){

        String output = nlpService.getPoS(word);
        return ResponseEntity.ok(output);
    }

}
