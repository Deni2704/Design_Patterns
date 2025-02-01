package buttonsAbstractFactory;

public class WindowsButtonAbstract implements ButtonAbstract{

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}
