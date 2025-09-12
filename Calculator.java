import java.util.Scanner;

class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a,int b){
        if(b==0) {
            System.out.println("b is zero");
              return 0;
        }
        else{
            return (double) a/b;
        }
    }
}

class Main {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
    Calculator calc= new Calculator();
    
    System.out.println("add"+ calc.add(a,b));
    System.out.println("Subtraction: " + calc.subtract(a, b));
    System.out.println("Multiplication: " + calc.multiply(a, b));
    System.out.println("Division: " + calc.divide(a, b));
    }
}