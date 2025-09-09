public class calculator {
    public calculator(){
        
 }

public int add(int a, int b){
    return a+b;
 }

public int substract(int a, int b){
    return a-b;
 }

public int multiply(int a, int b){
    return a*b;
 }

public double divide(int a, int b){
    return a/b;
 }

public int modulo(int a, int b){
    return a%b;
 }

public static void main(string[]args){
    calculator mycalculator = new calculator();
    system.out.println(mycalculator.add(5, 7));
    system.out.println(mycalculator.substract(45, 11));
    system.out.println(mycalculator.multiply(3, 2));
 }
}