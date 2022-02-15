package com.thesis.learnengback.service;

import com.thesis.learnengback.database.entity.FlashcardType;
import com.thesis.learnengback.database.entity.Flashcards;
import com.thesis.learnengback.database.repository.FlashcardTypeRepository;
import com.thesis.learnengback.database.repository.FlashcardsRepository;
import com.thesis.learnengback.transport.converter.FlashcardConv;
import com.thesis.learnengback.transport.converter.FlashcardTypeConv;
import com.thesis.learnengback.transport.dto.FlashcardTypeDTO;
import com.thesis.learnengback.transport.dto.FlashcardsDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class FlashcardsServiceTests {

    private FlashcardsService flashcardsService;
    private FlashcardsRepository flashcardsRepository;
    private FlashcardTypeRepository flashcardTypeRepository;

    @BeforeEach
    void setUp(){
        this.flashcardsRepository = Mockito.mock(FlashcardsRepository.class);
        this.flashcardTypeRepository = Mockito.mock(FlashcardTypeRepository.class);
        this.flashcardsService = new FlashcardsService(flashcardsRepository, flashcardTypeRepository);
    }

    @Test
    void  shouldAddNewFlashcards() {
        FlashcardType type = new FlashcardType(null, "NOWA");
        FlashcardTypeDTO typeDTO = FlashcardTypeConv.toDTO(type);
        List<Flashcards> list = new ArrayList<>();
        List<FlashcardsDTO> list2 = new ArrayList<>();

        FlashcardsDTO flashcardsDTO = new FlashcardsDTO("front", "back");

        list2.add(flashcardsDTO);
        list.add(FlashcardConv.toEntity2(flashcardsDTO,type));


        flashcardsService.add(list2, typeDTO);

        Mockito.verify(flashcardsRepository, Mockito.times(1)).saveAll(Mockito.eq(list));
    }
}
