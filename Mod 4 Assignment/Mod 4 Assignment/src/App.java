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
        System.out.println(PostfixCalculator.evaluation(exampleOne));

        //Example 2 - Valid
        String exampleTwo = "15 7 - 2 /";
        System.out.println(PostfixCalculator.evaluation(exampleTwo));

        //Example 2 - Valid
        String exampleThree = "2 3 + + 3 4 +";
        System.out.println(PostfixCalculator.evaluation(exampleThree));
    }
}
