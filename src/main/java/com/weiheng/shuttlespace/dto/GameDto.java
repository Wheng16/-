package com.weiheng.shuttlespace.dto;

import java.util.Date;

import com.weiheng.shuttlespace.model.GameType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameDto {
    
    private String description;

    private int playersJoined;

    private int playersNeeded;

    private String status;

    private GameType gameType;

    private Date startDateTime;

    private Date endDateTime;

    private Boolean isShuttleProvided;

    private int participationFee;

    private long hostId;
}
