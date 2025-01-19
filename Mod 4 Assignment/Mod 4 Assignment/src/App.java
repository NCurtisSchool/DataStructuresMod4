/*
Name: Nathan Curtis
Date: 1/12/2025
Class: Data Structures and Algorithms 24WB-CSC400-1
Teacher: Herbert Pensado
Assignment: Mod 4 Assignment - Option 1
GitHub: https://github.com/NCurtisSchool/DataStructuresMod4.git
*/

public class App {
    public static void main(String[] args) {
        PostfixCalc PostfixCalculator = new PostfixCalc();

        //Example 1 - Valid
        String exampleOne = "12 4 * 3 +";
        System.out.println("Given Input: " + exampleOne + "\nOutput: " + PostfixCalculator.evaluation(exampleOne) + "\n");

        //Example 2 - Valid
        String exampleTwo = "15 7 - 2 / 3 %";
        System.out.println("Given Input: " + exampleTwo + "\nOutput: " + PostfixCalculator.evaluation(exampleTwo) + "\n");

        //Example 3 - Not Valid
        String exampleThree = "2 3 + + 3 4 +";
        System.out.println("Given Input: " + exampleThree + "\nOutput: " + PostfixCalculator.evaluation(exampleThree) + "\n");

        //Example 4 - Valid
        String exampleFour = "23 43 + 11 % 4 4 + *";
        System.out.println("Given Input: " + exampleFour + "\nOutput: " + PostfixCalculator.evaluation(exampleFour) + "\n");

        //Example 5 - Valid
        String exampleFive = "13 7 15 + *";
        System.out.println("Given Input: " + exampleFive + "\nOutput: " + PostfixCalculator.evaluation(exampleFive) + "\n");

        //Example 6 - Not valid
        String exampleSix = "+ 1 2 3 4 5";
        System.out.println("Given Input: " + exampleSix + "\nOutput: " + PostfixCalculator.evaluation(exampleSix) + "\n");
    }
}
