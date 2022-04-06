package org.example.pattern_otus.command;

public class Echo implements Command {
    @Override
    public String execute(SomeObject object) {
        return object.getValue();
    }
}
