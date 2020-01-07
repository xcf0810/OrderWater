package com.po;

public class Buy {
    String orderId;
    String cusId;
    String sId;
    String orderDate;
    int num;

    @Override
    public String toString() {
        return "Buy{" +
                "orderId='" + orderId + '\'' +
                ", cusId='" + cusId + '\'' +
                ", sId='" + sId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", num=" + num +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
