package week5;

public class App {

    public static void main(String[] args){

        Logger message1 = new AsteriskLogger();
        Logger message2 = new SpacedLogger();

        message1.Log("Hello");
        System.out.println();
        message1.Error("Hello");
        System.out.println();
        message2.Log("Hello");
        System.out.println();
        message2.Error("Hello");
    }
}
