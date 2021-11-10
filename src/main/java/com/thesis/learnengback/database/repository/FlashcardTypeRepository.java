package com.thesis.learnengback.database.repository;

import com.thesis.learnengback.database.entity.FlashcardType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardTypeRepository extends JpaRepository<FlashcardType, Integer> {

    FlashcardType findByName(String flashcardName);
}
