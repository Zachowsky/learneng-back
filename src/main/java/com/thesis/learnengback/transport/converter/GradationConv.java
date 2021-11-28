package com.thesis.learnengback.transport.converter;

import com.thesis.learnengback.database.entity.Gradation;
import com.thesis.learnengback.transport.dto.GradationDTO;

public class GradationConv {

    public static GradationDTO toDTO(Gradation gradation){
        return  GradationDTO.builder().normal(gradation.getNormal()).comparative(gradation.getComparative()).superlative(gradation.getSuperlative()).build();
    }

    public static Gradation toEntity(GradationDTO gradationDTO){
        return Gradation.builder().normal(gradationDTO.getNormal()).comparative(gradationDTO.getComparative()).superlative(gradationDTO.getSuperlative()).build();
    }
}
