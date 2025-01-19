import java.util.Stack;

public class PostfixCalc {
    // Methods
    String evaluation(String inputString) {
        //Variables
        String exitString = "";

        try {
            //Containers
            String[] splitString = inputString.split("\\s+");
            Stack<Integer> calculationStack = new Stack<>();
            int tempHold;

            //Check all variables in spitString
            for (String givenVar : splitString) {
                //If int, add to stack
                try {
                    calculationStack.push(Integer.parseInt(givenVar));
                } catch (Exception e) {
                    switch(givenVar) {
                        case "+":
                            tempHold = calculationStack.pop();
                            calculationStack.push(calculationStack.pop() + tempHold);
                            break;
                        case "-":
                            tempHold = calculationStack.pop();
                            calculationStack.push(calculationStack.pop() - tempHold);
                            break;
                        case "*":
                            tempHold = calculationStack.pop();
                            calculationStack.push(calculationStack.pop() * tempHold);
                            break;
                        case "/":
                            tempHold = calculationStack.pop();
                            calculationStack.push(Math.round(calculationStack.pop() / tempHold));
                            break;
                        case "%":
                            tempHold = calculationStack.pop();
                            calculationStack.push(Math.round(calculationStack.pop() / tempHold));
                            break;
                        default:
                            throw e;
                    }
                }   
            }
            while (calculationStack.isEmpty() == false) {
                exitString = " " + calculationStack.pop() + exitString;
            }
        } catch (Exception e) {
            exitString = "Invalid postfix Expression";
        }
        return exitString.trim();
    }
}
