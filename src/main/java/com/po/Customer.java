package com.po;

import java.util.List;

public class Customer {

    String cusId;
    String cusName;
    String cusAddr;
    String cusTel;
//    订单

    List<OrderRecord> order;

    public List<OrderRecord> getOrder() {
        return order;
    }

    public void setOrder(List<OrderRecord> order) {
        this.order = order;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAddr() {
        return cusAddr;
    }

    public void setCusAddr(String cusAddr) {
        this.cusAddr = cusAddr;
    }

    public String getCusTel() {
        return cusTel;
    }

    public void setCusTel(String cusTel) {
        this.cusTel = cusTel;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "cusId='" + cusId + '\'' +
                ", cusName='" + cusName + '\'' +
                ", cusAddr='" + cusAddr + '\'' +
                ", cusTel='" + cusTel + '\'' +
                '}';
    }
}
