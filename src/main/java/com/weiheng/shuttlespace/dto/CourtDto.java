package com.weiheng.shuttlespace.dto;

import com.weiheng.shuttlespace.model.CourtType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CourtDto {
    
    private int number;

    private CourtType type;

    private int price;

    private long venueId;
}
