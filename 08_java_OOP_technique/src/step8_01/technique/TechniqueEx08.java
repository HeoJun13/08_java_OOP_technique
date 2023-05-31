package step8_01.technique;

/*
 * 
 *  # this , super
 * 
 * 	- this : 자신의 객체
 *    super : 부모클래스의 객체
 *  
 *  - this() : 자신의 생성자
 *    super() : 부모클래스의 생성자
 *  
 *  - this.testMethod() : 자신의 메서드 호출
 *    testMethod()		: 자신의 메서드 호출
 *    super.testMethod() : 부모의 메서드 호출
 * 
 * */

class Parent{
	
	String name;
	int age;
	
	Parent() {
		this("무몁" , 0);
		System.out.println("(p-기본) 부모클래스의 기본 생성자 호출");
	}
	
	Parent(String name, int age) {
		System.out.println("(p-추가) 부모클래스의 기본 생성자 호출");
	}
	
	void TestMrthod() {
		System.out.println("(P) call parent testMrthod");
	}
	
	
}

class Chlid extends Parent{

	Chlid() {
		//super(); // 부모의 클래스의 기본 생성자를 실행( 기본적으로 생략되어 있다.)
		super("앨런튜링" , 70); // 부모의 클래스의 추가된 생성자를 실행
		
		System.out.println("(C-기본) 자녀클래스의 기본 생성자 호출");
		
		System.out.println("\n===============\n");
	}
	
	Chlid(String name, int age) {
		//this();
		super();
		//super("엘런튜링" , 70);
		System.out.println("(C-추가) 자녀클래스의 기본 생성자 호출");
				
	}
	
	void TestMrthod() {
		System.out.println("(C) call Child testMrthod");
	}
	
	void callMethod() {
		
		
		System.out.println(super.name); // 부모클래스의 변수
		System.out.println(super.age);  // 부모클래스의 변수
		
		super.TestMrthod(); // 부모클리스의 testMethod호출
		this.TestMrthod(); // 자신의 testMethod호출
		TestMrthod();  // 자신의 testMethod호출 (보통 this는 생략한다)
	}
}



public class TechniqueEx08 {

	public static void main(String[] args) {
		
		new Parent();
		System.out.println(); //p-기본 
		
		new Parent("제임스고슬링" , 70);
		System.out.println();
		
		new Chlid();
		System.out.println();
		
		
		Chlid c = new Chlid("제임스고슬링주니어" , 40);
		System.out.println();
		c.callMethod();
		
		
	}

}
