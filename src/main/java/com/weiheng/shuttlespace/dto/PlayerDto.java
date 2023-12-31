package com.weiheng.shuttlespace.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlayerDto {
    
    private String name;

    private int age;
    
    private String gender;

    private String contactNumber;

    private String emailAddress;

    private String avatarUrl;
}
