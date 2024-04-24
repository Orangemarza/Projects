public class Calculator {
    public Calculator() {
  
    }
  
    public int add(int a, int b) {
      int result = a + b;
      return result;
    }
  
    public int subtract(int a, int b) {
      int result = a - b;
      return result;
    }
  
    public int multiply(int a, int b) {
      int result = a*b;
      return result;
    }
  
    public int divide(int a, int b) {
      int result = a/b;
      return result;
    }
  
    public int modulo(int a, int b) {
      int result = a%b;
      return result;
    }
  
    public static void main(String[] args){
      Calculator myCalculator = new Calculator();
      int add = myCalculator.add(5,7);
      System.out.println(add);
      int subtract = myCalculator.subtract(45,11);
      System.out.println(subtract);
      
    }
  }