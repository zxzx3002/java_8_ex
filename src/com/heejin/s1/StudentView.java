package com.heejin.s1;

public class StudentView {
	//StudentService stdSer = new StudentService();
	//학생들의 정보를 출력
	//메서드명 view
	//학생들의 정보를 출력
	public void view(Student [] s) {	
		for(int i=0;i<s.length;i++) {
		System.out.println("학생이름 : "+s[i].name);
		System.out.println("학생번호 : "+s[i].num);
		}
	}
	public void pointView(Student [] s) {
		for(int i=0;i<s.length;i++) {
			System.out.println("학생국어점수 : "+s[i].kor);
			System.out.println("학생영어점수 : "+s[i].eng);
			System.out.println("학생수학점수 : "+s[i].math);
			System.out.println("총점 : "+s[i].total);
			System.out.println("평점 : "+s[i].avg);
		}
	}
	public void viewStudent(Student [] s) {
		for(int i=0;i<s.length;i++) {
			System.out.println();
		}
	}
}
