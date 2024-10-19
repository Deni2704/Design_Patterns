package buttonsAbstractFactory;

public class MacOSButton implements ButtonAbstract{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
