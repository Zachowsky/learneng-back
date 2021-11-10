package com.thesis.learnengback.rest;

import com.thesis.learnengback.database.entity.FlashcardType;
import com.thesis.learnengback.database.entity.Flashcards;
import com.thesis.learnengback.database.repository.FlashcardTypeRepository;
import com.thesis.learnengback.database.repository.FlashcardsRepository;
import com.thesis.learnengback.service.FlashcardsService;
import com.thesis.learnengback.transport.converter.FlashcardConv;
import com.thesis.learnengback.transport.converter.FlashcardTypeConv;
import com.thesis.learnengback.transport.dto.FlashcardTypeDTO;
import com.thesis.learnengback.transport.dto.FlashcardsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dashboard")
public class FlashcardController {

    private FlashcardTypeRepository flashcardTypeRepository;
    private FlashcardsRepository flashcardsRepository;

    @Autowired
    public FlashcardController (FlashcardTypeRepository flashcardTypeRepository, FlashcardsRepository flashcardsRepository){
        this.flashcardTypeRepository = flashcardTypeRepository;
        this.flashcardsRepository = flashcardsRepository;
    }

    @GetMapping
    public ResponseEntity<List<FlashcardTypeDTO>> getAllFlashcard(){
        List<FlashcardTypeDTO> flashcardTypeDTOListDTOS = flashcardTypeRepository.findAll().stream().map(FlashcardTypeConv::toDTO).collect(Collectors.toList());
        return ResponseEntity.ok(flashcardTypeDTOListDTOS);
    }

    @PostMapping("/{type}")
    public ResponseEntity<List<FlashcardsDTO>> findAllFlashcardsByType(@PathVariable String type){

        FlashcardType byFlashcardType = flashcardTypeRepository.findByName(type);
        List<FlashcardsDTO> flashcardsDTOList = flashcardsRepository.findAllByFlashcardType(byFlashcardType).stream().map(FlashcardConv::toDTO).collect(Collectors.toList());

        return ResponseEntity.ok(flashcardsDTOList);
    }

}