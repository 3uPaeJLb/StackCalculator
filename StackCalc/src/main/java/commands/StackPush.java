package commands;

import factory.CalcStack;

public class StackPush implements Command{
    @Override
    public void doOperarion(CalcStack stack, String[] commandLine){
        stack.push(commandLine[1]);
    }
}
