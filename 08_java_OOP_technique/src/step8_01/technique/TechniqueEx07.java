package step8_01.technique;

/*

	# 메서드 오버라이딩 ( Method Overriding )
	
	- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
	- 부모클래스의 메서드와 이름이 같고 구현되는 기능이 다르다.
	- 객체지향 기법의 다형성(polymorphism)을 구현하는 핵심기능이다.
	- 메서드 오버로딩과 혼용되기 쉽다.
	     메서드 오버라이딩 : 부모클래스와 자녀클래스 사이의 메서드이름이 같음(재 정의)
	     메서드 오버로딩 : 같은 클래스 안에서 메서드이름이 같음(중복 정의)

*/

class Warrior2 extends Beginner{
	
	
	// 메서드 오버라이딩( 메서드 재정의 )
	
	void levelUP() {
		this.level++;
		this.power += 30000;
		this.dex += 3000;
		this.life += 10000;
		this.mana += 10;
	}
	
	void dash() { // Wairror2 클래스만의 메서드 추가
		System.out.println("call dask metthod");
	}
	
	
}
	//메서드 오버라이딩( 메서드 재정의 )
class Wizard2 extends Beginner{
	
	void levelUP() {
		this.level++;
		this.power += 10;
		this.dex += 1000;
		this.life += 200;
		this.mana += 3000;
	}
	void fireball() { // Wizard2 클래스만의 메서드 추가
		System.out.println("call dask fireball");
	}
	
}


public class TechniqueEx07 {

	public static void main(String[] args) {
		
		Warrior2 war2 = new Warrior2();
		war2.showSrarus();
		war2.levelUP();
		war2.levelUP();
		war2.levelUP();
		war2.showSrarus();
		
		System.out.println("\n===============\n");
		
		Wizard2 wiz2 = new Wizard2();
		wiz2.showSrarus();
		wiz2.levelUP();
		wiz2.levelUP();
		wiz2.levelUP();
		wiz2.showSrarus();
		
		System.out.println("\n===============\n");
		
		war2.dash();
		wiz2.fireball();
		
	}

}
