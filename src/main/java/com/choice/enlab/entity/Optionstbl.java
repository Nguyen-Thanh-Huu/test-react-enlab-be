package com.choice.enlab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="optiontbl")
public class Optionstbl {
    @Id
    @GeneratedValue
    private int id;
    private int idquestion;
    private String answer;
    private Boolean correct; 
}
