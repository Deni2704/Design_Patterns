package app;

import buttonsAbstractFactory.ButtonAbstract;
import checkboxes.Checkbox;
import factories.GUIFactory;

import java.awt.desktop.AppForegroundListener;
//factory users don't care which concrete factory they use
//since they work with factories and products through abstract interfaces
public class Application {
    private ButtonAbstract button;
    private Checkbox checkbox;
    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
