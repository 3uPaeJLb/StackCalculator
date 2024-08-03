package commands;

import factory.CalcStack;

import java.util.Stack;

public class Plus implements Command
{
    @Override
    public void doOperarion(CalcStack stack, String[] commandLine)
    {
        double firstNumber = 0;
        double secondNumber = 0;
        double rez = 0;

        firstNumber = stack.pop();
        secondNumber = stack.pop();

        rez = firstNumber + secondNumber;
        stack.stackPush(rez);
    }
}
