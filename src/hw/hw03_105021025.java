package hw;
import java.util.Scanner;
public class hw03_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int val = scn.nextInt();
		int a=0,b=0,c=0;
		while(val!=999){
			if(val>0){
				a++;
			}
			else if(val==0){
				b++;
			}else{
				c++;
			}
			val = scn.nextInt();
		}
		System.out.println("¥¿¼Æ¡G" + a);
		System.out.println("¹s¡G" + b);
		System.out.print("­t¼Æ¡G" + c);
	}

}
