package commands;
import factory.CalcStack;

public class Define implements Command{
    @Override
    public void doOperarion(CalcStack stack, String[] commandLine)
    {
        stack.addVar(commandLine[1], commandLine[2]);
    }
}