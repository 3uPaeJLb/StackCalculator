package commands;
import factory.CalcStack;

import java.util.Stack;
public interface Command
{
    void doOperarion(CalcStack stack, String[] commandLine);

}
