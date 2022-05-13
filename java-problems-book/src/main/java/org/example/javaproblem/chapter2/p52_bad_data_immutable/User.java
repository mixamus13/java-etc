package org.example.javaproblem.chapter2.p52_bad_data_immutable;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
public class User {

    private final String nickName;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final LocalDateTime created;
}
