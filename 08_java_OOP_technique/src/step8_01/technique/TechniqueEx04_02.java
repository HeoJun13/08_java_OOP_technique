package step8_01.technique;

// 생성자를 이용한 멤버변수 초기화

class GoodsDTO {
	
	String goodsCode;
	String goodsName;
	int goodsPrice;
	
	
	// 생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields..
	GoodsDTO(String goodsCode, String goodsName, int goodsPrice) {
		super();
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}

	
	
	
	
	//void setData(String goodsCode , String goodsName  , int goodsPrice) {
	//	this.goodsCode = goodsCode;
	//	this.goodsName = goodsName;
	//	this.goodsPrice = goodsPrice;
	//}
	
	
	
	void printData() {
		System.out.println("goodsCode : " + this.goodsCode);
		System.out.println("goodsName : " + this.goodsName);
		System.out.println("goodsPrice : " + this.goodsPrice);
		System.out.println();
	}

}

public class TechniqueEx04_02 {

	public static void main(String[] args) {
		
		//GoodsDTO temp = new GoodsDTO();
		//temp.goodsCode = "상품코드";
		//temp.goodsName = "상품명";
		//temp.goodsPrice = 0;
		
		GoodsDTO g1 =  new GoodsDTO("0x001", "맨투맨", 40000); 
		//g1.setData("0x001", "맨투맨", 40000);
		
		GoodsDTO g2 = new GoodsDTO("0x002", "조거팬츠", 30000);
		//g2.setData("0x002", "조거팬츠", 30000);
		
		GoodsDTO g3 = new GoodsDTO("0x003", "바람막이", 70000);
		//g2.setData("0x003", "바람막이", 70000);
		
		g1.printData();
		g2.printData();
		g3.printData();
		
	
	}
		
}

