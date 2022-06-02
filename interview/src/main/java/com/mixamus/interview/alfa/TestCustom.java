package com.mixamus.interview.alfa;

import lombok.Data;

import java.util.List;
import java.util.stream.Stream;

public class TestCustom {
}

@Data
class Us {
    private String username;
    private Integer age;
    private List<Group> groups;
}

@Data
class Grup {
    private String name;
    private String description;
    private List<User> users;
}

class SomeConsumer {

    // Return list of users with any group starting with "A"
    public List<User> consume(Stream<User> usersStream) {
        return usersStream.filter(user -> user.getGroups() != null && !user.getGroups().isEmpty())
                .filter(user -> user.getGroups().stream()
                        .filter(group -> group.getName() != null && group.getName().isEmpty())
                        .anyMatch(group -> group.getName().startsWith("A")))
                .toList();
    }

}
