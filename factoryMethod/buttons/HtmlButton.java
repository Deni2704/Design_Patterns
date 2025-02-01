package buttons;

public class HtmlButton implements Button{
    @java.lang.Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @java.lang.Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World'");
    }
}
