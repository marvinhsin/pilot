import java.util.*;

public class Calculator {
    public static int evaluateExpression(int[] numbers, String[] operators) {
        List<Integer> numList = new ArrayList<>();
        List<String> opList = new ArrayList<>();

        for (int num : numbers) {
            numList.add(num);
        }
        Collections.addAll(opList, operators);

        // Handle multiplication and division
        for (int i = 0; i < opList.size(); i++) {
            if (opList.get(i).equals("Mul") || opList.get(i).equals("Div")) {
                int a = numList.get(i);
                int b = numList.get(i + 1);
                int result = opList.get(i).equals("Mul") ? (a * b) : (a / b);

                // Replace the numbers and remove operator
                numList.set(i, result);
                numList.remove(i + 1);
                opList.remove(i);
                i--;
            }
        }

        // Handle addition and subtraction
        int result = numList.get(0);
        for (int i = 0; i < opList.size(); i++) {
            if (opList.get(i).equals("Add")) {
                result += numList.get(i + 1);
            } else if (opList.get(i).equals("Sub")) {
                result -= numList.get(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {5, 6, 14, 7};
        String[] input2 = {"Add", "Sub", "Div"};

        int result = evaluateExpression(input1, input2);
        System.out.println("Result: " + result);
    }
}
