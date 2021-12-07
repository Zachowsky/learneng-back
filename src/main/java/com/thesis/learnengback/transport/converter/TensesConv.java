package com.thesis.learnengback.transport.converter;

import com.thesis.learnengback.database.entity.Tenses;
import com.thesis.learnengback.transport.dto.TensesDTO;

public class TensesConv {
    public static TensesDTO toDTO(Tenses tenses){
        return TensesDTO.builder().answer(tenses.getAnswer()).sentence(tenses.getSentence()).build();
    }

    public static Tenses toEntity(TensesDTO tenses){
        return Tenses.builder().answer(tenses.getAnswer()).sentence(tenses.getSentence()).build();
    }
}
