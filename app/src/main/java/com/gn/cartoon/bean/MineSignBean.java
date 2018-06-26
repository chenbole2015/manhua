package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/6/7.
 */

public class MineSignBean {
    private int day;

    private boolean isSign;

    private String prize;

    public MineSignBean(int dayArp, boolean isSignArp, String prizeArp) {
        day = dayArp;
        isSign = isSignArp;
        prize = prizeArp;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int dayArp) {
        day = dayArp;
    }

    public boolean isSign() {
        return isSign;
    }

    public void setSign(boolean signArp) {
        isSign = signArp;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prizeArp) {
        prize = prizeArp;
    }
}
