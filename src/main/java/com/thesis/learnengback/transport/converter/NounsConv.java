package com.thesis.learnengback.transport.converter;

import com.thesis.learnengback.database.entity.Nouns;
import com.thesis.learnengback.transport.dto.NounsDTO;

public class NounsConv {

    public static NounsDTO toDTO(Nouns nouns){
        return NounsDTO.builder().noun(nouns.getNoun()).isCountable(nouns.isCountable()).build();
    }

    public static Nouns toDTO(NounsDTO nouns){
        return Nouns.builder().noun(nouns.getNoun()).isCountable(nouns.isCountable()).build();
    }

}
