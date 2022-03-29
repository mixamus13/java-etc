package org.example.refactoring_guru.abstract_factory.factories;

import org.example.refactoring_guru.abstract_factory.buttons.Button;
import org.example.refactoring_guru.abstract_factory.buttons.LinuxButton;
import org.example.refactoring_guru.abstract_factory.checkboxes.Checkbox;
import org.example.refactoring_guru.abstract_factory.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
