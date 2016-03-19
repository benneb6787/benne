package jave;
import java.util.Scanner;
public class jave3 {
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		String q,w;
		System.out.println("가위,바위,보 게임을 시작하겠습니다.");
		System.out.print("현영-");
		q=a.next();
		System.out.print("영미-");
		w=a.next();
		if(q.equals(w)){
			System.out.println("무승부입니다.");
		}
		else if(q.equals("가위")){
			if(w.equals("바위")){
				System.out.println("현영이가 이겼습니다");
			}
			else System.out.println("영미가 이겼습니다");
		}
		else if(q.equals("바위")){
			if(w.equals("보")){
				System.out.println("영미가 이겼습니다");
			}
			else System.out.println("현영이가 이겼습니다");
		}
		else if(q.equals("보")){
			if(w.equals("가위")){
				System.out.println("영미가 이겼습니다");
			}
			else System.out.println("현영이가 이겼습니다");
		}
		else System.out.println("다시 입력하세요");
	}
}
