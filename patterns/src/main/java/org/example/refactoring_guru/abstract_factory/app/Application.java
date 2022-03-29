package org.example.refactoring_guru.abstract_factory.app;

import org.example.refactoring_guru.abstract_factory.buttons.Button;
import org.example.refactoring_guru.abstract_factory.checkboxes.Checkbox;
import org.example.refactoring_guru.abstract_factory.factories.GUIFactory;

public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
