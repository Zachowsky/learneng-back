package com.thesis.learnengback.database.entity;


import com.thesis.learnengback.database.enumeration.TenseType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tenseId;
    private TenseType tense;
    private String sentence;
    private String answer;
}
