package Chater1;

public class ShopOrder {
    private String shopId;
    private String userId;
    private String orderDate;
    private String userName;
    private String productId;
    private String address;

    public ShopOrder() {}

    public void shopOrderInfo() {
        System.out.println("주문 번호:" + this.shopId);
        System.out.println("주문자 아이디:" + this.userId);
        System.out.println("주문 날짜:" + this.orderDate);
        System.out.println("주문자 이름:" + this.userName);
        System.out.println("주문 상품 번호:" + this.productId);
        System.out.println("배송 주소:" + this.address);
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
