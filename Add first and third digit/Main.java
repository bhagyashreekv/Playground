import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
      int N= in.nextInt();
      int n1=N/100;
      int  n2= N%10;
      int s= n1+n2;
      System.out.println(s);// Type your code here
	}
}