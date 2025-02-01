import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;
    public static void main(String[] args){
        configure();
        runBussinessLogic();
    }
    static void configure(){
        if(System.getProperty("os.name").equals("Windows10")){
            dialog = new WindowsDialog();
        }
        else {
            dialog = new HtmlDialog();
        }
    }
    //all the client code should work
    //with factories and products through
    //abstract interfaces
    static void runBussinessLogic(){
        dialog.renderWindow();
    }
}
