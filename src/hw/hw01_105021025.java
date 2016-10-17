package hw;
import java.util.Scanner;
public class hw01_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] val = new int[n];
		val[0]=1;
		val[1]=1;
		if(n>2){
			for(int a=2;a<n;a++){
				val[a]=val[a-2]+val[a-1];
			}
			for(int a=0;a<n;a++){
				System.out.print(val[a] + " ");
			}
		}else{
			for(int a=0;a<n;a++){
				System.out.print(val[a] + " ");
			}
		}
	}

}
