package jave;
import java.util.Scanner;
public class jave1 {
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		int x,i=1;
		double y,z,sum;
		while(i!=0){
	System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요");
	x=a.nextInt();
	y=a.nextDouble();
	z=a.nextDouble();
	sum=x+y+z;
	System.out.println("당신의 나이는 "+x+"살입니다.");
	System.out.println("당신의 체중은"+y+"kg입니다.");
	System.out.println("당신의 신장은"+z+"cm입니다.");
	System.out.println("당신의 신장은"+sum+"입니다.");
	System.out.println("종료하고 싶으면 0을 누르세요");
	i=a.nextInt();
	}
	}
}
