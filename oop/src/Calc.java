public class Calc {
    private double number1;
    private double number2;

    public void setNumber1(double number1) {
        this.number1 = number1;
    }
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double sum() {
        return number1 + number2;
    }
    public double min(){
        return number1 - number2;
    }
    public double dev(){
        return number1/number2;
    }
    public double reiz(){
        return number1*number2;
    }
}
