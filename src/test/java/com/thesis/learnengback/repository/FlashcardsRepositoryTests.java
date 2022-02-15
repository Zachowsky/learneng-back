package com.thesis.learnengback.repository;

import com.thesis.learnengback.database.entity.FlashcardType;
import com.thesis.learnengback.database.repository.FlashcardsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class FlashcardsRepositoryTests {

	private FlashcardsRepository flashcardsRepository;

	@BeforeEach
	void setUp(){
		this.flashcardsRepository = Mockito.mock(FlashcardsRepository.class);
	}

	@Test
	void shouldFindAllFlashcardsByType() {
		FlashcardType flashcardType = new FlashcardType(null, "ZWIERZETA");

		flashcardsRepository.findAllByFlashcardType(flashcardType);

		Mockito.verify(flashcardsRepository, Mockito.times(1)).findAllByFlashcardType(Mockito.eq(flashcardType));
	}
}
