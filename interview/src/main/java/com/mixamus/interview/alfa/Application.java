package com.mixamus.interview.alfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String... args) {

        List<Group> groups1 = new ArrayList<>();
        groups1.add(new Group("Adas", "fereon", new ArrayList<>()));
        groups1.add(new Group("Deres", "dsfesvfse", new ArrayList<>()));
        groups1.add(new Group("Ldas", "kskslsls", new ArrayList<>()));
        groups1.add(new Group("Dere", "ssfsllll", new ArrayList<>()));
        groups1.add(new Group("Dlana", "ssfsllll", new ArrayList<>()));

        List<Group> groups2 = new ArrayList<>();
        groups2.add(new Group(null, null, new ArrayList<>()));
        groups2.add(new Group("Dlana", "ssfsllll", new ArrayList<>()));

        List<Group> groups3 = new ArrayList<>();
        groups3.add(new Group("Dere", "ssfsllll", new ArrayList<>()));
        groups3.add(new Group("Dlana", "ssfsllll", new ArrayList<>()));
        groups3.add(new Group("Alana", "ssfsllll", new ArrayList<>()));
        groups3.add(null);

        Stream<User> users = Stream.of(
                new User("Nas", 12, groups1),
                new User("Mada", 23, groups2),
                new User("Terad", 66, groups3)
        );

        List<User> consume = consume(users);
        System.out.println("consume = " + consume.stream().map(User::getUserName).toList());

    }

    // Return list of users with any group starting with "A"
    public static List<User> consume(Stream<User> usersStream) {
        return usersStream.filter(user -> user.getGroups() != null && !user.getGroups().isEmpty())
                .filter(user -> user.getGroups().stream()
                        .filter(group -> group.getName() != null)
                        .anyMatch(group -> group.getName().toLowerCase().startsWith("a")))
                .toList();
    }

    public static List<User> consumeV2(Stream<User> usersStream) {
        return usersStream.filter(u -> (Objects.nonNull(u.getGroups()) && !u.getGroups().isEmpty()))
                .filter(u -> u.getGroups().stream()
                        .filter(g -> Objects.nonNull(g.getName()))
                        .anyMatch(g -> g.getName().toLowerCase().startsWith("a")))
                .toList();

    }
}
