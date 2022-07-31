package assistedproject2;

public class FinallyBlockDemo {
	  public static void main(String[] args)
      {
          int a=99,b=0,result=0;
          try
          {
              result = a / b;
          }
          catch(ArithmeticException Ex)
          {
              System.out.print("\n\tError : " + Ex.getMessage());
          }
          finally
          {
              System.out.print("\n\tThe result is : " + result);
          }
      }
  }
