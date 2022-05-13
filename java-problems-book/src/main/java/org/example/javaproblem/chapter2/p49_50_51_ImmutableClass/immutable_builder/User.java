package org.example.javaproblem.chapter2.p49_50_51_ImmutableClass.immutable_builder;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
public class User {

    private final String nickname;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final Date created = new Date();
}
