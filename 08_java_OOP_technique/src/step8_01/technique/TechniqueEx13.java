package step8_01.technique;

import java.util.ArrayList;

/*
 * 
 * # toString : 객체에 관한 정보를 문자열로 반환한다.
 * 
 * */

class OrderDTO {
	
	private String orderID;
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(String goodsID) {
		this.goodsID = goodsID;
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public String getGoodsTitle() {
		return goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}
	public String getDeliveryMEthod() {
		return deliveryMEthod;
	}
	public void setDeliveryMEthod(String deliveryMEthod) {
		this.deliveryMEthod = deliveryMEthod;
	}
	public String getDeliverAddress() {
		return deliverAddress;
	}
	public void setDeliverAddress(String deliverAddress) {
		this.deliverAddress = deliverAddress;
	}
	public String getDeliveryMessage() {
		return deliveryMessage;
	}
	public void setDeliveryMessage(String deliveryMessage) {
		this.deliveryMessage = deliveryMessage;
	}
	
	// toString 생성 단축키
	// 좌측 상단 Source > Generate toString > Generate
	
	private String goodsID;
	@Override
	public String toString() {
		return "OrderDTO [orderID=" + orderID + ", goodsID=" + goodsID + ", memberID=" + memberID + ", goodsTitle="
				+ goodsTitle + ", deliveryMEthod=" + deliveryMEthod + ", deliverAddress=" + deliverAddress
				+ ", deliveryMessage=" + deliveryMessage + "]";
	}

	private String memberID;
	private String goodsTitle;
	private String deliveryMEthod;
	private String deliverAddress;
	private String deliveryMessage;
	
	
	
	
	
}


public class TechniqueEx13 {

	public static void main(String[] args) {
		
		OrderDTO order1 = new OrderDTO();
		//order1.orderId = "order1";
		order1.setOrderID("order1");
		order1.setGoodsID("goods1");
		order1.setMemberID("member1");
		order1.setGoodsTitle("스프링문법");
		order1.setDeliverAddress("테헤란로");
		order1.setDeliveryMEthod("택배수령");
		order1.setDeliveryMessage("경비실 앞에 맡겨주세요.");
		
		System.out.println(order1.getOrderID());
		System.out.println(order1.getGoodsID());
		System.out.println(order1.getMemberID());
		
		System.out.println(order1);
	
		
		OrderDTO order2 = new OrderDTO();
		order2.setOrderID("order2");
		order2.setGoodsID("goods2");
		order2.setMemberID("member2");
		order2.setGoodsTitle("JSP문법");
		order2.setDeliverAddress("삼성동");
		order2.setDeliveryMEthod("편의점");
		order2.setDeliveryMessage("배송전 연락주세요.");
		
		System.out.println(order2);
		
		ArrayList<OrderDTO> orderList = new ArrayList<OrderDTO>();
		for (int i = 0; i < 10; i++) {
			OrderDTO temp = new OrderDTO();
			temp.setOrderID("주문테스트" + i);
			temp.setGoodsID("상품테스트" + i);
			temp.setMemberID("멤버테스트" +  i);
			temp.setGoodsTitle("JSP문법");
			temp.setDeliverAddress("삼성동");
			temp.setDeliveryMEthod("편의점");
			temp.setDeliveryMessage("배송전 연락주세요.");
			orderList.add(temp);
			
		}
		System.out.println(orderList);
		
		
	}

}
