package calculator;

public class Calculator{
    public Calculator(){
}

public int add(int a, int b ) {
    return a + b;

}

public int substract (int a, int b){
    return a - b ;
}

public int multiply(int a , int b){
    return a*b;
}

public double divide(int a, int b){
    return a/b;  
}

public int modulo(int a, int b){
    return a%b;

}

public static void main(String[] args) {
    Calculator MYCALCULATOR = new Calculator();
    System.out.println(MYCALCULATOR.add(5,7));
    System.out.println(MYCALCULATOR.substract(45,11));
    System.out.println(MYCALCULATOR.multiply(3,2));
}
}
