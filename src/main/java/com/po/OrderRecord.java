package com.po;

import java.util.Date;

public class OrderRecord {
    int orderId;
    String cusId;
    String wtId;
    int num;
    float wtCost;
    String status;
    String sId;

    public String getsId() {
        return sId;
    }

    @Override
    public String toString() {
        return "OrderRecord{" +
                "orderId=" + orderId +
                ", cusId='" + cusId + '\'' +
                ", wtId='" + wtId + '\'' +
                ", num=" + num +
                ", wtCost=" + wtCost +
                ", status=" + status +
                ", sId='" + sId + '\'' +
                '}';
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getWtId() {
        return wtId;
    }

    public void setWtId(String wtId) {
        this.wtId = wtId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getWtCost() {
        return wtCost;
    }

    public void setWtCost(float wtCost) {
        this.wtCost = wtCost;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
