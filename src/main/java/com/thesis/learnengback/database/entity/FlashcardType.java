package com.thesis.learnengback.database.entity;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Getter
@Setter
@Builder
public class FlashcardType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeID;
    private String name;
}
