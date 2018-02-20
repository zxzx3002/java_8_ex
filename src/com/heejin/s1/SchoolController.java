package com.heejin.s1;

import java.util.Scanner;

public class SchoolController {
	//메서드명 start
	//리턴x
	//내용
	//1.학생등록
	//2.성적입력
	//3.성적조회
	//4.전체조회
	//5.프로그램종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		while(check) {
			System.out.println("번호를 입력해 주세요");
			System.out.println("1.학생등록");
			System.out.println("2.성적입력");
			System.out.println("3.성적조회");
			System.out.println("4.전체조회");
			System.out.println("5.프로그램종료");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("1.학생등록");
			}else if(choice==2) {
				System.out.println("2.성적입력");
			}else if(choice==3) {
				System.out.println("3.성적조회");
			}else if(choice==4) {
				System.out.println("4.전체조회");
			}else if(choice==5) {
				System.out.println("5.프로그램종료");
				break;
			}else {
				System.out.println("번호를 잘못 누르셨습니다. 다시 입력해 주세요");
			}
		}
	}
}
