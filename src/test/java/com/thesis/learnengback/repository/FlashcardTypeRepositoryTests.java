package com.thesis.learnengback.repository;

import com.thesis.learnengback.database.repository.FlashcardTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FlashcardTypeRepositoryTests {

    private FlashcardTypeRepository flashcardTypeRepository;

    @BeforeEach
    void setUp(){
        this.flashcardTypeRepository = Mockito.mock(FlashcardTypeRepository.class);
    }

    @Test
    void shouldFindFlashcardTypeByName(){
        String name = "Name";

        flashcardTypeRepository.findByName(name);

        Mockito.verify(flashcardTypeRepository, Mockito.times(1)).findByName(Mockito.eq(name));

    }
}
