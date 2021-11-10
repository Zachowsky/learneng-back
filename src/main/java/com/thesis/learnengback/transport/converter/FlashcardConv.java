package com.thesis.learnengback.transport.converter;

import com.thesis.learnengback.database.entity.Flashcards;
import com.thesis.learnengback.transport.dto.FlashcardsDTO;

public class FlashcardConv {
    public static FlashcardsDTO toDTO(Flashcards card){
        return FlashcardsDTO.builder().front(card.getFront()).back(card.getBack()).build();
    }
}
