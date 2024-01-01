package com.weiheng.shuttlespace.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlayerDto {
    
    private String name;

    private Date dateOfBirth;
    
    private String gender;

    private String contactNumber;

    private String emailAddress;

    private String avatarUrl;
}
