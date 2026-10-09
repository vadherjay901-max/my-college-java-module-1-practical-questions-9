import java.util.Scanner;
public class p9
{
 public static void main(String args[])
 {
  Scanner s1 = new Scanner (System.in);
  System.out.println("Enter the number of terms :");
  int n =s1.nextInt();

  int a=0,b=1,c;
  System.out.println("fibonacci series :");
 
  for(int i=1; i<=n;i++)
  {
   System.out.print(a+" ");
   c=a+b;
   a=b;
   b=c;
  }
 }
}