package com.po;

public class Water {

    int wtId;
    String sId;
//  单价
    double wtCost;
//  库存
    int num;

    @Override
    public String toString() {
        return "Water{" +
                "wtId=" + wtId +
                ", sId='" + sId + '\'' +
                ", wtCost=" + wtCost +
                ", num=" + num +
                '}';
    }

    public int getWtId() {
        return wtId;
    }

    public void setWtId(int wtId) {
        this.wtId = wtId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public double getWtCost() {
        return wtCost;
    }

    public void setWtCost(double wtCost) {
        this.wtCost = wtCost;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
