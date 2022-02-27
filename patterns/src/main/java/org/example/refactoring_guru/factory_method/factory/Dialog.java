package org.example.refactoring_guru.factory_method.factory;

import org.example.refactoring_guru.factory_method.buttons.Button;

/**
 * Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в которой требуется
 * создание разнообразных продуктов.
 */
public abstract class Dialog {

  public void renderWindow() {
    // ... остальной код диалога ...

    Button button = createButton();
    button.render();
  }

  /**
   * Подклассы будут переопределять этот метод, чтобы создавать конкретные объекты продуктов, разные для каждой фабрики.
   */
  public abstract Button createButton();
}
