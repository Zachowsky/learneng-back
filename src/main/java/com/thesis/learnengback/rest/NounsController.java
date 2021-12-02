package com.thesis.learnengback.rest;


import com.thesis.learnengback.database.repository.NounsRepository;
import com.thesis.learnengback.transport.converter.NounsConv;
import com.thesis.learnengback.transport.dto.NounsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/nouns")
public class NounsController {

    private NounsRepository nounsRepository;

    @Autowired
    public NounsController(NounsRepository nounsRepository) {
        this.nounsRepository = nounsRepository;
    }

    @GetMapping("/all")
    public ResponseEntity<List<NounsDTO>> getAllNouns(){
        List<NounsDTO> nounsDTOList = nounsRepository.findAll().stream().map(NounsConv::toDTO).collect(Collectors.toList());

        Collections.shuffle(nounsDTOList);

        List<NounsDTO> randomNounsList = nounsDTOList.subList(0, 10);

        return ResponseEntity.ok(randomNounsList);

    }
}
