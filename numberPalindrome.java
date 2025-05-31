import java.util.Scanner;
public class numberPalindrome{
public static boolean isPalindrome(int n){
int rem=0,rev=0,originalnumber=n;
while(n>0){
rem=n%10;
rev=rev*10+rem;
n/=10;
}
if(originalnumber==rev)
return true;
else
 return false;
 }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(isPalindrome(n));

}
}