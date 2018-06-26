package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/6/8.
 */

public class MineVipBean {

    private int isHot;

    private int mouth;

    private double money;
    private String freeThings;

    private boolean isSelect;

    private double grice;

    public double getGrice() {
        return grice;
    }

    public void setGrice(double griceArp) {
        grice = griceArp;
    }

    public MineVipBean(int isHotArp, int mouthArp, double moneyArp, String freeThingsArp, boolean
            isSelectArp, double griceArp) {
        isHot = isHotArp;
        mouth = mouthArp;
        money = moneyArp;
        freeThings = freeThingsArp;
        isSelect = isSelectArp;
        grice = griceArp;
    }

    public int getIsHot() {
        return isHot;
    }

    public void setIsHot(int isHotArp) {
        isHot = isHotArp;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouthArp) {
        mouth = mouthArp;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double moneyArp) {
        money = moneyArp;
    }

    public String getFreeThings() {
        return freeThings;
    }

    public void setFreeThings(String freeThingsArp) {
        freeThings = freeThingsArp;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean selectArp) {
        isSelect = selectArp;
    }
}
