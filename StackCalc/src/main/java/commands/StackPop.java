package commands;

import factory.CalcStack;

public class StackPop {
    public void doOperarion(CalcStack stack, String[] commandLine){
        double number = stack.pop();
        System.out.println(number);
    }
}