package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex01_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int val=0,time=0,tol=0;
		while(val!=-1){
			val = scn.nextInt();
				if(val!=-1){
				tol+=val;
				}
			time++;
		}
		time--;
		System.out.println("總合：" + tol);
		System.out.println("平均：" + (float)tol/time);
	}

}
