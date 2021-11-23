package com.thesis.learnengback.service;

import com.thesis.learnengback.database.entity.FlashcardType;
import com.thesis.learnengback.database.entity.Flashcards;
import com.thesis.learnengback.database.repository.FlashcardTypeRepository;
import com.thesis.learnengback.database.repository.FlashcardsRepository;
import com.thesis.learnengback.transport.converter.FlashcardConv;
import com.thesis.learnengback.transport.converter.FlashcardTypeConv;
import com.thesis.learnengback.transport.dto.FlashcardTypeDTO;
import com.thesis.learnengback.transport.dto.FlashcardsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class FlashcardsService {

    private FlashcardsRepository flashcardsRepository;
    private FlashcardTypeRepository flashcardTypeRepository;

    @Autowired
    public FlashcardsService(FlashcardsRepository flashcardsRepository, FlashcardTypeRepository flashcardTypeRepository) {
        this.flashcardsRepository = flashcardsRepository;
        this.flashcardTypeRepository = flashcardTypeRepository;
    }

    public boolean add(FlashcardsDTO[] flashcardsDTO, FlashcardTypeDTO type){

        List<Flashcards> conv = new ArrayList<>();

        FlashcardType type1 = FlashcardTypeConv.toEntity(type);
        flashcardTypeRepository.save(type1);

        for (FlashcardsDTO dto : flashcardsDTO) {
            conv.add(FlashcardConv.toEntity2(dto, type1));
        }

        flashcardsRepository.saveAll(conv);

        return true;
    }
}