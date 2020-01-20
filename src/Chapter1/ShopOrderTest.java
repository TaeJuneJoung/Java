package Chapter1;

public class ShopOrderTest {
    public static void main(String[] args) {
        ShopOrder shopOrder = new ShopOrder();
        shopOrder.setShopId("201907210001");
        shopOrder.setUserId("abc123");
        shopOrder.setOrderDate("2019년 7월 21일");
        shopOrder.setUserName("홍길순");
        shopOrder.setProductId("PD0345-12");
        shopOrder.setAddress("서울시 영등포구 여의도동 20번지");

        shopOrder.shopOrderInfo();
    }
}
