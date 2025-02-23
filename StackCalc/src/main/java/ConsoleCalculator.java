import commands.Command;
import factory.CalcStack;
import factory.Factory;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ConsoleCalculator {

    private Factory factory;
    private CalcStack stack;

    public ConsoleCalculator()
    {
        factory = new Factory();
        stack = new CalcStack();
    }
    public void start() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        String string;
        String[] splitString;
        Command command;

        while (scanner.hasNextLine())
        {
            string = scanner.nextLine();
            splitString = string.split(" ");

            command = factory.createCommand(splitString[0]);

            command.doOperarion(stack, splitString);
        }
    }
}

