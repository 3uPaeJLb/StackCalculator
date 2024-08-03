package factory;
import java.util.*;

public class CalcStack {
    public Stack<Double> stack = new Stack<>();

    public Map<String, Double> map = new HashMap<>();

    public void addVar(String var, String number) {
        map.put(var, Double.parseDouble(number));
    }

    public void push(String number) {
        //stack.push(Double.parseDouble(number));
        if(!isNumber(number))
        {
            stack.push(map.get(number));// if argument is a letter
        }
        else {
            stack.push(Double.parseDouble(number));//if argument is number
        }
    }

    private boolean isNumber(String number)
    {
        if (number == null || number.isEmpty())
            return false;
        for (int i = 0; i < number.length(); i++)
        {
            if (!Character.isDigit(number.charAt(i)))
                return false;
        }
        return true;
    }
    public void stackPush(double number)
    {
        stack.push(number);
    }

    public double pop() {
        return stack.pop();
    }

    public double peek() {
        return stack.peek();
    }
}
