package org.example.javaproblem.chapter2.p52_bad_data_immutable;

import lombok.extern.slf4j.Slf4j;
import lombok.val;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import java.time.LocalDateTime;
import java.util.Set;

@Slf4j
public class Main {

    public static void main(String... args) {
        User user;

        val validator = Validation.buildDefaultValidatorFactory().getValidator();

        val userBuilder = User.builder()
                .nickName("monika")
                .password("klooi0988")
                .email("monika@gmail.com")
                .firstName("Monika")
                .lastName("Gunther")
                .created(LocalDateTime.now());

        val violations = validator.validate(userBuilder);

        if (violations.isEmpty()) {
            user = userBuilder.build();
            log.debug("User successfully created on: {}", user.getCreated());
        } else {
            printConstraintViolations("UserBuilder Violations: ", violations);
        }
    }

    private static <T> void printConstraintViolations(String caption, Set<ConstraintViolation<T>> violations) {
        log.debug("caption {}", caption);
        violations.forEach(v -> log.debug(" {} {} ", v.getPropertyPath(), v.getMessage()));
    }
}
