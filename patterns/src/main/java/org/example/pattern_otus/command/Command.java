package org.example.pattern_otus.command;

@FunctionalInterface
public interface Command {
    String execute(SomeObject object);
}
