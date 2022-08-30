package com.decadave.kafkaspring.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User
{
    private int id;
    private String fullName;
    private String email;
    private String password;
}
