package jave;
import java.util.Scanner;
public class jave3 {
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		String q,w;
		System.out.println("����,����,�� ������ �����ϰڽ��ϴ�.");
		System.out.print("����-");
		q=a.next();
		System.out.print("����-");
		w=a.next();
		if(q.equals(w)){
			System.out.println("���º��Դϴ�.");
		}
		else if(q.equals("����")){
			if(w.equals("����")){
				System.out.println("�����̰� �̰���ϴ�");
			}
			else System.out.println("���̰� �̰���ϴ�");
		}
		else if(q.equals("����")){
			if(w.equals("��")){
				System.out.println("���̰� �̰���ϴ�");
			}
			else System.out.println("�����̰� �̰���ϴ�");
		}
		else if(q.equals("��")){
			if(w.equals("����")){
				System.out.println("���̰� �̰���ϴ�");
			}
			else System.out.println("�����̰� �̰���ϴ�");
		}
		else System.out.println("�ٽ� �Է��ϼ���");
	}
}
