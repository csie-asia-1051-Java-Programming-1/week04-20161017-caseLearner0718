package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex04_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數n及一個字元符號");
		int n = scn.nextInt();
		char val = scn.next().charAt(0);
		int c = n;
		for(int a=1;a<=n;a++){
			for(int b=c;b>0;b--){
				System.out.print("*");
			}
			System.out.println();
			c--;
		}
	}

}
