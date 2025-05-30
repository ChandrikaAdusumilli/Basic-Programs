import java.util.Scanner;
public class primeNumber{
 public static boolean PrimeOrNot(int n){
   if(n<=1){
    return false;
   }
  for(int i=2;i<=n/2;i++){
    if(n%2==0){
      return false;
    }
}
return true;
}
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  if(PrimeOrNot(n))
    System.out.println("yes");
  else
    System.out.println("no");
  }
}