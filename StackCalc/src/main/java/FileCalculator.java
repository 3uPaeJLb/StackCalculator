import commands.Command;
import factory.CalcStack;
import factory.Factory;

import java.io.File;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class FileCalculator
{
    private static final String FILE_PATH = "src/main/resources/data.txt";
    private File file;
    private Factory factory;
    private CalcStack stack;

    public FileCalculator()
    {
        file = new File(FILE_PATH);
        factory = new Factory();
        stack = new CalcStack();
    }

    public void start() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, FileNotFoundException {
        Scanner scanner = new Scanner(file);

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

