package com.thesis.learnengback.transport.converter;

import com.thesis.learnengback.database.entity.Translation;
import com.thesis.learnengback.transport.dto.TranslationDTO;

public class TranslationConv {
    public static TranslationDTO toDTO(Translation translation){
        return TranslationDTO.builder().answer(translation.getAnswer()).sentence(translation.getSentence()).build();
    }

    public static Translation toEntity(TranslationDTO translation){
        return Translation.builder().answer(translation.getAnswer()).sentence(translation.getSentence()).build();
    }
}
