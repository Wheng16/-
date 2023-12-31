package com.weiheng.shuttlespace.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="players")
@Data
@NoArgsConstructor
public class Player {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int age;

    private String gender;

    private String contactNumber;

    private String emailAddress;

    private String avatarUrl;
}
