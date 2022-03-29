package org.example.refactoring_guru.abstract_factory.buttons;

public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
