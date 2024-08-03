package commands;

import factory.CalcStack;

import java.util.Stack;

public class Print implements Command{
    @Override
    public void doOperarion(CalcStack stack, String[] commandLine)
    {
        double firstNumber = stack.pop();

        System.out.println(firstNumber);
    }
}
