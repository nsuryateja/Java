package interfaces;

interface Prime{
    public boolean isPrime(int num);
}

public class LambdaPrime {
    public static void main(String args[]) {
      
      Prime p = n -> {
          for(int i =2; i < n; i++)
      {
                         if(n %2 != 0)
                              continue;
                         else
                              return false;
      }
      return true;
      };
      int num = (int)(Math.random() * 50) + 2;
      System.out.println(num);
      System.out.println(p.isPrime((int)num));
    }
}
