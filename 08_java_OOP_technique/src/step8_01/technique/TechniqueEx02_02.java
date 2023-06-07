package step8_01.technique;

import step8_01.technique.ModifierTest;



import modiFierTest.ModifierEx;


// public class A{}    // (가능) 하나의 클래스파일에는 하나의 public만 존재할 수 있다.
class B{}     	       // (가능)
// protected class C{} // 불가능 : class앞에는 public , default 접슨 제어자만 사용가능하다.
// private class D{}    // 불가능 : class앞에는 public , default 접슨 제어자만 사용가능하다.


public class TechniqueEx02_02 {
	
class Test1 extends ModifierEx{
		
		void text() {
			
			//System.out.println(pubilcV); // 같은 프로젝트 이므로 접슨 가능
			//System.out.println(defaultV); // 같은 패키지 이므로 접근 가능
			//System.out.println(protecredV); // 상속관계 이므로 접근 가능
			//System.out.println(privateV); // (불가) 다른 클래스 이므로 접 불가능
			 
			//pubilcM(); // 같은 프로젝트 이므로 접슨 가능
			//drfaultM(); // 같은 패키지 이므로 접근 가능
			//protectedM(); // 상속관계 이므로 접근 가능
			//privateM(); // (불가) 다른 클래스 이므로 접슨근불가능
		}
	}


	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
