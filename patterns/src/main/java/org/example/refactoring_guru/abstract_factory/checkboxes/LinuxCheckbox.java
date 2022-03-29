package org.example.refactoring_guru.abstract_factory.checkboxes;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created LinuxCheckbox.");
    }
}
