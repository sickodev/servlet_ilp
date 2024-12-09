import java.util.Scanner;

public class InputHandler {
    public static InputHandler instance = null;

    public Scanner in;

    private InputHandler() {
        in = new Scanner(System.in);
    }

    public static InputHandler getInstance() {
        if (instance == null) {
            instance = new InputHandler();
        }

        return instance;
    }

    public static void close(){
        instance.in.close();
    }
}
