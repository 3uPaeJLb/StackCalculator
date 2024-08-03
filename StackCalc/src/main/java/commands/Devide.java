package commands;

import factory.CalcStack;

public class Devide implements Command{

    @Override
    public void doOperarion(CalcStack stack, String[] commandLine)
    {
        double firstNumber = 0;
        double secondNumber = 0;
        double rez = 0;

        firstNumber = stack.pop();
        secondNumber = stack.pop();

        rez = firstNumber / secondNumber;
        stack.stackPush(rez);

    }
}
