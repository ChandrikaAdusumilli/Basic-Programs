import java.util.Scanner;
public class fibonacciNumbersUptoN{
 public static int fib(int n){
  if (n == 0)
            return 0;
        if (n == 1)
            return 1;
  int a=0,b=1,c=1;
  for(int i=2;i<=n;i++){
    c=a+b;
    a=b;
    b=c;
   }
  return c;
 }
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 for(int i=0;i<=n;i++){
  System.out.println(fib(i));
 } 
}
}