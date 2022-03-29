package org.example.refactoring_guru.abstract_factory;

import org.example.refactoring_guru.abstract_factory.app.Application;
import org.example.refactoring_guru.abstract_factory.factories.LinuxFactory;
import org.example.refactoring_guru.abstract_factory.factories.MacOSFactory;
import org.example.refactoring_guru.abstract_factory.factories.WindowsFactory;

public class Demo {

    public static void main(String... args) {
        Application application = configureApplication();
        application.paint();
    }

    private static Application configureApplication() {
        Application application;
        var osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac os x")) application = new Application(new MacOSFactory());
        else if (osName.contains("windows")) application = new Application(new WindowsFactory());
        else application = new Application(new LinuxFactory());
        return application;
    }
}
