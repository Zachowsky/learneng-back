package com.thesis.learnengback.database.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Builder
public class Flashcards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cardId;
    @ManyToOne
    private FlashcardType flashcardType;
    private String front;
    private String back;
}
