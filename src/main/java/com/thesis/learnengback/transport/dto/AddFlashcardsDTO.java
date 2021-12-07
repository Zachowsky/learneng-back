package com.thesis.learnengback.transport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class AddFlashcardsDTO {
    private FlashcardTypeDTO type;
    private FlashcardsDTO[] flashcard;
}
