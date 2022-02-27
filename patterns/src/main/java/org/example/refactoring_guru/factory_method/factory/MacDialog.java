package org.example.refactoring_guru.factory_method.factory;

import org.example.refactoring_guru.factory_method.buttons.Button;
import org.example.refactoring_guru.factory_method.buttons.MacButton;

public class MacDialog extends Dialog {

  @Override
  public Button createButton() {
    return new MacButton();
  }
}
