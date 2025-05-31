import java.util.Scanner;
public class reverseString{
 public static String stringReverse(String s){
 String s1="";
 for(int i=0;i<s.length();i++){
 char ch=s.charAt(i);
 s1=ch+s1;
  }
  return s1;
 }
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
 System.out.println(stringReverse(s));
 }
}