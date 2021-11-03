package com.thesis.learnengback.database.repository;

import com.thesis.learnengback.database.entity.Flashcards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardsRepository extends JpaRepository<Flashcards, Integer> {
}
