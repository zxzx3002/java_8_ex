package com.heejin.s1;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	int stuNum=0;
	//학생추가메서드
	//메서드명addStudent
	//학생의 인원수를 입력하세요
	//이름,번호 입력 인원수대로 나와야함
	public Student[] addStudent() {
		System.out.println("학생의 수를 입력하세요");
		stuNum=sc.nextInt();
		Student [] addStd = new Student[stuNum]; 
		
		for(int i=0;i<stuNum;i++) {
			Student s = new Student(); 
			System.out.println("이름을 입력하세요");
			s.name=sc.next();
			System.out.println("번호를 입력하세요");
			s.num=sc.nextInt();
			addStd[i]=s;
		}
		return addStd;
			
	}
	public void point(Student [] n) {
		for(int i=0;i<n.length;i++) {
		System.out.println(n[i].name+"학생의 국어점수를 입력하세요");
		n[i].kor=sc.nextInt();
		System.out.println(n[i].name+"학생의 영어점수를 입력하세요");
		n[i].eng=sc.nextInt();
		System.out.println(n[i].name+"학생의 수학점수를 입력하세요");
		n[i].math=sc.nextInt();
		n[i].total=n[i].eng+n[i].eng+n[i].math;
		n[i].avg=n[i].total/3.0;
		}

	}
	//search 메서드명
	//번호를 입력 받아서 학생 한명을 찾아서
	//해당 출력은 StudentView class의 viewStudent메서드에서 출력
	public void search(Student [] n) {
		for(int i=0;i<n.length;i++) {
			System.out.println("학생의 번호를 입력받으세요");
			
			
		}
		
	}
}
