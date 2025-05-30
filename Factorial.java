import java.util.Scanner;
public class Factorial{
 public static int fact(int n){
 int product=1;
 for(int i=1;i<=n;i++){
  product*=i;
  }
  return product;
 }
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
System.out.println(fact(n));
 }
}