package jave;
import java.util.Scanner;
public class jave1 {
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		int x,i=1;
		double y,z,sum;
		while(i!=0){
	System.out.println("����, ü��, ������ ��ĭ���� �и��Ͽ� ������� �Է��ϼ���");
	x=a.nextInt();
	y=a.nextDouble();
	z=a.nextDouble();
	sum=x+y+z;
	System.out.println("����� ���̴� "+x+"���Դϴ�.");
	System.out.println("����� ü����"+y+"kg�Դϴ�.");
	System.out.println("����� ������"+z+"cm�Դϴ�.");
	System.out.println("����� ������"+sum+"�Դϴ�.");
	System.out.println("�����ϰ� ������ 0�� ��������");
	i=a.nextInt();
	}
	}
}
