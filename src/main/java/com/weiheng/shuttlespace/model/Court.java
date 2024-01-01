package com.weiheng.shuttlespace.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity( name="courts" )
@Data
@NoArgsConstructor
public class Court {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;

    private int number;

    private CourtType type;

    private int price;

    private long venueId;
}
