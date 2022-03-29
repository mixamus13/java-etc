package org.example.refactoring_guru.abstract_factory.factories;

import org.example.refactoring_guru.abstract_factory.buttons.Button;
import org.example.refactoring_guru.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
