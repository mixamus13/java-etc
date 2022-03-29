package org.example.refactoring_guru.abstract_factory.factories;

import org.example.refactoring_guru.abstract_factory.buttons.Button;
import org.example.refactoring_guru.abstract_factory.buttons.MacOsButton;
import org.example.refactoring_guru.abstract_factory.checkboxes.Checkbox;
import org.example.refactoring_guru.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
