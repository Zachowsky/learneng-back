package com.thesis.learnengback.transport.converter;

import com.thesis.learnengback.database.entity.FlashcardType;
import com.thesis.learnengback.transport.dto.FlashcardTypeDTO;


public class FlashcardTypeConv {

   public static FlashcardTypeDTO toDTO(FlashcardType name){
       return FlashcardTypeDTO.builder().name(name.getName()).build();
   }


}
