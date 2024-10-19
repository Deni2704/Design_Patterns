package factory;


import buttons.Button;
//base factory class.
//"factory" is merely a role for the class.
//it should have some core business logic which needs
//different products to be created
public abstract class Dialog {
    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();
}
