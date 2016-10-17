package hw;
import java.util.Scanner;
public class hw04_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入1~4");
		int what = scn.nextInt();
		while(what>0&&what<4){
			switch(what){
			case 1:
				System.out.println("請輸入n");
				int n = scn.nextInt();
				int c = (n+1)/2;
				int flat=0;
				for(int a=1;a<=n;a++){
					for(int b=1;b<=c;b++){
						System.out.print("@");
					}
					if(c==1){
						flat=1;
					}
					if(flat==0){
					c--;
					}
					else if(flat==1){
					c++;
					flat=1;
					}
//					System.out.println(c + " " + flat);
					System.out.println();
				}
				break;
			case 2:
				System.out.println("請輸入n");
				n = scn.nextInt();
				c = 1;
				flat=0;
				for(int a=1;a<=n;a++){
					for(int b=1;b<=c;b++){
						System.out.print("%");
					}
					if(c==(n+1)/2){
						flat=1;
					}
					if(flat==0){
					c++;
					}
					else if(flat==1){
					c--;
					flat=1;
					}
//					System.out.println(c + " " + flat);
					System.out.println();
				}
				break;
			case 3:
				System.out.println("請輸入n");
				n = scn.nextInt();
				int space=n/2,x=1;
				int sflat=0,xflat=0;
				for(int a=1;a<=n;a++){
					for(int b=1;b<=space;b++){
						System.out.print(" ");
					}
					for(int b=1;b<=x;b++){
						System.out.print("#");
					}
					if(space==0){
						sflat=1;
					}
					if(x==n){
						xflat=1;
					}
					if(sflat==0){
						space--;
					}else if(sflat==1){
						space++;
					}
					if(xflat==0){
						x+=2;
					}else if(xflat==1){
						x-=2;
					}
					System.out.println();
				}
				break;
			}
		}
	}
}
