package jave;
import java.util.Scanner;
public class jave2 {
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		int q,w,e,r;
		System.out.println("������ �Է��ϼ���");
		q=a.nextInt();
		w=q/3600;
		e=q%3600;
		r=e%60;
		e=e/60;
		System.out.println(q+"�ʴ� "+w+"�ð�"+e+"��"+r+"���Դϴ�.");
	}
}
