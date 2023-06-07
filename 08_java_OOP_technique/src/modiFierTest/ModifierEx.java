package modiFierTest;

public class ModifierEx {

		public int pubilcV;
		int defaultV;
		protected int protecredV;
		private int privateV;

		public void pubilcM() {}
		void drfaultM() {}
		protected void protectedM() {}
		private void privateM() {}
		
		
	}
	
	class Test1 extends ModifierEx{
		
		void text() {
			
			System.out.println(pubilcV); // 같은 프로젝트 이므로 접슨 가능
			System.out.println(defaultV); // 같은 패키지 이므로 접근 가능
			System.out.println(protecredV); // 상속관계 이므로 접근 가능
			//System.out.println(privateV); // (불가) 다른 클래스 이므로 접 불가능
			 
			pubilcM(); // 같은 프로젝트 이므로 접슨 가능
			drfaultM(); // 같은 패키지 이므로 접근 가능
			protectedM(); // 상속관계 이므로 접근 가능
			//privateM(); // (불가) 다른 클래스 이므로 접슨근불가능
		}
	}
	
	
	



 