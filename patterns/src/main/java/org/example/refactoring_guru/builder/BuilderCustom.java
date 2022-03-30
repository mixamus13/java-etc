package org.example.refactoring_guru.builder;

import java.util.Objects;

public class BuilderCustom {

    private final Long id;
    private final String login;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Integer age;


    private BuilderCustom(Builder builder) {
        this.id = builder.id;
        this.login = builder.login;
        this.password = builder.password;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "BuilderCustom{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {

        private Long id;
        private String login;
        private String password;
        private String firstName;
        private String lastName;
        private String email;
        private Integer age;

        Builder paramOne(Long id) {
            if (id == null) {
                throw new IllegalArgumentException("id can not be null");
            }
            this.id = id;
            return this;
        }

        Builder paramTwo(String login) {
            this.login = login;
            return this;
        }

        Builder paramThree(String password) {
            this.password = password;
            return this;
        }

        Builder paramFour(String firstName) {
            this.firstName = firstName;
            return this;
        }

        Builder paramFive(String lastName) {
            this.lastName = lastName;
            return this;
        }

        Builder paramSix(String email) {
            this.email = email;
            return this;
        }

        Builder paramSeven(Integer age) {
            this.age = age;
            return this;
        }

        BuilderCustom build() {
            return new BuilderCustom(this);
        }

    }
}
