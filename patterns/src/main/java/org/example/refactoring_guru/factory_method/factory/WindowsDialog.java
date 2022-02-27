package org.example.refactoring_guru.factory_method.factory;

import org.example.refactoring_guru.factory_method.buttons.Button;
import org.example.refactoring_guru.factory_method.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
