package factories;

import buttonsAbstractFactory.ButtonAbstract;
import buttonsAbstractFactory.MacOSButton;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;
//each concrete factory extends basic factory and responsible
//for creating products of a single variety
public class MacOSFactory implements GUIFactory{
    @Override
    public ButtonAbstract createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
