package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex02_105021025 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char a = 'Y';
		while(a == 'Y'){
			System.out.println("請輸入兩個正整數");
			int b = scn.nextInt();
			int c = scn.nextInt();
			System.out.println( b + "*" + c + "=" + (b*c));
			System.out.print("是否繼續使用?(Y/n)");
			a = scn.next().charAt(0);
		}
		System.out.print("掰掰");
	}

}
