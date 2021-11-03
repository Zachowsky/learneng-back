package com.thesis.learnengback.database.repository;

import com.thesis.learnengback.database.entity.Nouns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NounsRepository extends JpaRepository<Nouns, Integer> {
}
