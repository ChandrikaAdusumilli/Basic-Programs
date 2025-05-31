import java.util.Scanner;
public class stringPalindrome{
 public static void isPalindrome(String s){
 String s1="";
 for(int i=0;i<s.length();i++){
 char ch=s.charAt(i);
 s1=ch+s1;
 }
 if(s1.equals(s))
  System.out.println("Palindrome");
  else
  System.out.println("Not Palindrome");
 }
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine().toLowerCase();
 isPalindrome(s);
 }
}