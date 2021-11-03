package com.thesis.learnengback.database.repository;

import com.thesis.learnengback.database.entity.Tenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TensesRepository extends JpaRepository<Tenses, Integer> {
}
