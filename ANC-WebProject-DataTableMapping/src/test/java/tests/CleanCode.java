package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.CalculationClass;

public class CleanCode {

    //Only create new variable when needed more than once
    //If logic is being reused, then create it as a function
    //In order to return a value, use DataType instead of void. See example - addTwoTexts

    @Test
    public void calculator() {
//        int x = 2;
//        int y = 3;
//        int result = x + y;
//        System.out.println(result);
//
//        int a = 6;
//        int b = 5;
        CalculationClass calculationClass = new CalculationClass();
        calculationClass.additionFunction(2, 3);
        calculationClass.subtractionFunction(6, 5);

        int result = calculationClass.additionFunction(3, 4);
        Assert.assertEquals(7, result);
        String resultText = calculationClass.addTwoTexts("Text one", "Text two");
        System.out.println(result);
    }

}
