import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        int length = args.length;

        if (length != 0) {
            FileCalculator filecalculator = new FileCalculator();

            filecalculator.start();
        }
        else
        {
            ConsoleCalculator consoleCalculator = new ConsoleCalculator();
            consoleCalculator.start();
        }
    }
}