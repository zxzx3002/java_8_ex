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
		StudentService stdService = new StudentService();
		StudentView stdView = new StudentView();
		Student [] n=null;
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		int choice;
		while(check) {
			System.out.println("번호를 입력해 주세요");
			System.out.println("1.학생등록");
			System.out.println("2.성적입력");
			System.out.println("3.성적조회");
			System.out.println("4.전체조회");
			System.out.println("5.프로그램종료");
			choice=sc.nextInt();
			if(choice==1) {
				System.out.println("1.학생등록");
				n=stdService.addStudent();
				
			}else if(choice==2) {
				System.out.println("2.성적입력");
				stdService.point(n);
			}else if(choice==3) {
				System.out.println("3.학생조회");
				
			}else if(choice==4) {
				System.out.println("4.전체조회");
				stdView.view(n);
				stdView.pointView(n);
			}else if(choice==5) {
				System.out.println("5.프로그램종료");
				break;
			}else {
				System.out.println("번호를 잘못 누르셨습니다. 다시 입력해 주세요");
			}
		}
	}
}
