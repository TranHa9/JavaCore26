public class Calculator {
    int number1;
    int number2;

    public void printInfo() {
        System.out.println("Số: "+ number1 + " và số " + number2);
    }
    public int sum(int number1, int number2){
       return number1 + number2;
    }
    public int subtract(int number1, int number2){
        return number1 - number2;
    }
    public int multi(int number1, int number2){
        return number1 * number2;
    }
    public int division(int number1, int number2){
        return number1 / number2;
    }

}
