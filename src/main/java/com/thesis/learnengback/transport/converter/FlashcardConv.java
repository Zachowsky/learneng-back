package com.thesis.learnengback.transport.converter;

import com.thesis.learnengback.database.entity.FlashcardType;
import com.thesis.learnengback.database.entity.Flashcards;
import com.thesis.learnengback.transport.dto.FlashcardTypeDTO;
import com.thesis.learnengback.transport.dto.FlashcardsDTO;

public class FlashcardConv {
    public static FlashcardsDTO toDTO(Flashcards card){
        return FlashcardsDTO.builder().front(card.getFront()).back(card.getBack()).build();
    }

    public static Flashcards toEntity(FlashcardsDTO flashcardsDTO){
        return Flashcards.builder().front(flashcardsDTO.getFront()).back(flashcardsDTO.getBack()).build();
    }

    public static Flashcards toEntity2(FlashcardsDTO flashcardsDTO, FlashcardType type){
        return Flashcards.builder().flashcardType(type).front(flashcardsDTO.getFront()).back(flashcardsDTO.getBack()).build();
    }
}
