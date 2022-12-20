package utilities;

public class CalculationClass {


    public int additionFunction(int one, int two){
        int result = one + two;
        System.out.println(result);
        return result;
    }
    public void subtractionFunction(int one, int two){
        int result = one - two;
        System.out.println(result);
    }
//    public void multiplicationFunction(int one, int two){
//        int result = one * two;
//        System.out.println(result);
//    }
//    public void divisionFunction(int one, int two){
//        int result = one / two;
//        System.out.println(result);
//    }

    public int returnAnInt(int one, int two) {
        return one;
    }

    public String addTwoTexts(String one, String two){
        String result = one + two;
        return result;
    }
}
