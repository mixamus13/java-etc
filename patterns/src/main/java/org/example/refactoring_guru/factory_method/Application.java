package org.example.refactoring_guru.factory_method;

import org.example.refactoring_guru.factory_method.factory.Dialog;
import org.example.refactoring_guru.factory_method.factory.HtmlDialog;
import org.example.refactoring_guru.factory_method.factory.MacDialog;
import org.example.refactoring_guru.factory_method.factory.WindowsDialog;

public class Application {

  private static Dialog dialog;

  public static void main(String... args) {
    configure();
    runBusinessLogic();
  }

  /**
   * Приложение создаёт определённую фабрику в зависимости от конфигурации или окружения.
   */
  private static void configure() {
    if (System.getProperty("os.name").equals("Windows 10")) {
      dialog = new WindowsDialog();
    } else if (System.getProperty("os.name").equals("Mac OS X")) {
      dialog = new MacDialog();
    } else {
      dialog = new HtmlDialog();
    }
  }

  /**
   * Весь остальной клиентский код работает с фабрикой и продуктами только через общий интерфейс, поэтому для него неважно какая фабрика была создана.
   */
  private static void runBusinessLogic() {
    dialog.renderWindow();
  }

}
