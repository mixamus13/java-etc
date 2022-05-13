package org.example.javaproblem.chapter2.p49_50_51_ImmutableClass.immutable_builder;

public class Main {
    public static void main(String... args) {
        User user1 = User.builder()
                .firstname("marin21")
                .password("hajj9887h")
                .build();
        System.out.println("User 1 successfully created on: " + user1.getCreated());

        // user with nickname, password and email
        User user2 = User.builder()
                .nickname("ink")
                .password("44fef22")
                .email("ion@gmail.com")
                .build();

        System.out.println("User 2 successfully created on: " + user2.getCreated());

        // user with nickname, password, email, firstname and lastname
        User user3 = User.builder()
                .nickname("monika")
                .password("klooi0988")
                .email("monika@gmail.com")
                .firstname("Monika")
                .lastname("Ghuenter")
                .build();

        System.out.println("User 3 successfully created on: " + user3.getCreated());
        //User 3 successfully created on: Thu May 12 22:49:56 MSK 2022
    }
}
