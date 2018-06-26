package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/6/8.
 */

public class TransationDetailBean {

    private String time;
    private double values;

    private String payMode;

    private String title;

    private String orderNum;

    public TransationDetailBean(String timeArp, double valuesArp, String payModeArp, String
            titleArp, String orderNumArp) {
        time = timeArp;
        values = valuesArp;
        payMode = payModeArp;
        title = titleArp;
        orderNum = orderNumArp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String timeArp) {
        time = timeArp;
    }

    public double getValues() {
        return values;
    }

    public void setValues(double valuesArp) {
        values = valuesArp;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payModeArp) {
        payMode = payModeArp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titleArp) {
        title = titleArp;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNumArp) {
        orderNum = orderNumArp;
    }
}
