package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/5/16.
 */

public class MineReadCouponBean {
    private String readInfo;
    private String time;


    public MineReadCouponBean(String readInfoArp, String timeArp) {
        readInfo = readInfoArp;
        time = timeArp;
    }

    public String getReadInfo() {
        return readInfo;
    }

    public void setReadInfo(String readInfoArp) {
        readInfo = readInfoArp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String timeArp) {
        time = timeArp;
    }
}
