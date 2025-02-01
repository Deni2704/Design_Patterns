package factories;

import buttonsAbstractFactory.ButtonAbstract;
import buttonsAbstractFactory.WindowsButtonAbstract;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;
//each concrete factory extends basic factory and responsible
//for creating products of a single variety
public class WindowsFactory implements GUIFactory{
    @Override
    public ButtonAbstract createButton() {
        return new WindowsButtonAbstract();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
