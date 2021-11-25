package com.thesis.learnengback.database.repository;

import com.thesis.learnengback.database.entity.Translation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TranslationRepository  extends JpaRepository<Translation, Integer> {
    List<Translation> findAllByTense(String tense);
}
