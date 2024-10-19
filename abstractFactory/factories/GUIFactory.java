package factories;

import buttonsAbstractFactory.ButtonAbstract;
import checkboxes.Checkbox;

public interface GUIFactory {
    ButtonAbstract createButton();
    Checkbox createCheckbox();
}
