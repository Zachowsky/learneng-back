package com.thesis.learnengback.rest;

import com.thesis.learnengback.database.repository.GradationRepository;
import com.thesis.learnengback.service.NLPService;
import com.thesis.learnengback.transport.converter.GradationConv;
import com.thesis.learnengback.transport.dto.GradationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gradation")
public class GradationController {

    private GradationRepository gradationRepository;
    private NLPService nlpService;

    @Autowired
    public GradationController(GradationRepository gradationRepository, NLPService nlpService) {
        this.gradationRepository = gradationRepository;
        this.nlpService = nlpService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<GradationDTO>> getAllGradation(){
       List<GradationDTO> gradationDTOList = gradationRepository.findAll().stream().map(GradationConv::toDTO).collect(Collectors.toList());
       Collections.shuffle(gradationDTOList);

       List<GradationDTO> randomGradationList = gradationDTOList.subList(0, 10);

       return ResponseEntity.ok(randomGradationList);
    }

    @GetMapping("/check/{word}")
    public ResponseEntity<String> checkIfCorrectAdjective(@PathVariable String word){

        String output = nlpService.getPoS(word);
        return ResponseEntity.ok(output);
    }

}
