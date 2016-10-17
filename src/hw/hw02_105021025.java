package hw;
import java.util.Scanner;
public class hw02_105021025 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤Jn,m");
		int n = scn.nextInt();
		int m = scn.nextInt();
		int c;
		c = thx(n) / (thx(m)*thx(n-m));
		System.out.print(c);
	}
	
	public static int thx(int a){
		int tol=1;
		for(int b=1;b<=a;b++){
			tol*=b;
		}
		return tol;
	}

}
