package commands;

import factory.CalcStack;

import java.util.Stack;

public class SQRT implements Command{

    @Override
    public void doOperarion(CalcStack stack, String[] commandLine)
    {
        double firstNumber = 0;

        double rez = 0;

        firstNumber = stack.pop();

        rez = Math.sqrt(firstNumber);
        stack.stackPush(rez);
    }
}
