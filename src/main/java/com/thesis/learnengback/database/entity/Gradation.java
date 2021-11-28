package com.thesis.learnengback.database.entity;

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
public class Gradation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gradationId;
    private String normal;
    private String comparative;
    private String superlative;

}
