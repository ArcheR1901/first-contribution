import java.util.Scanner;
public class inversed
{
	//inveres the number and adds the digit
	public static void main(String[] args) {

	  int ans = 0;
	  System.out.print("Enter a number:");
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  while(n>0){
	      ans = ans*10+(n%10)/2; 
	      n = n/10;
	  }
      sc.close();
	  System.out.println(ans);
	}
}
