package org.example.pattern_otus.command;

public class Custom implements Command {
    @Override
    public String execute(SomeObject object) {
        object.setValue(object.getValue() + "+CUSTOM");
        return "CUSTOM added";
    }
}
