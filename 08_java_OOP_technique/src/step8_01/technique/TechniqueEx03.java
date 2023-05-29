package step8_01.technique;
/*
   
	# static
 	
 	- 정적 필드와 정적 메소드는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.
 	- Static 키워드를 통해 생성된 정적멤버들은 Heap영역이 아닌 Static영역에 할당한다.
 	- Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.
 	- Garbage Collector의 관리 영역 밖에 존재하기에 Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재한다.
 
 */

class character {
	
	int hp = 100;
	static int moveSpeed = 5;
	
	void ShowStatus() {
		
		System.out.println("hp : " + hp);
		System.out.println("moveSpeed : " + moveSpeed);
		System.out.println();
	}
	
	static void speedUp() {
		moveSpeed += 30;
	}
	
	
}

public class TechniqueEx03 {

	public static void main(String[] args) {
		
		
		 character c1 = new character();
		 c1.hp = 0;
		 // 클래스명 .static 변수명으로 접근
		 
		 
		 character.moveSpeed = 100;      //c1.moveSpeed = 100;
		 
		// 클래스명 .static 메서명으로 접근
		 character.speedUp();
		 c1.ShowStatus();
		 
		 character c2 = new character();
		 c2.hp = 50;
		 c2.ShowStatus();
		 
		 character c3 = new character();
		 c3.ShowStatus();
		 
		 System.out.println("\n================\n");
		
		 
		 // static 예시

		 System.out.println(Math.PI);
		 System.out.println(Math.abs(-5));
		
		 try {
			Thread.sleep(3000);
			System.out.println("끝                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}

}
