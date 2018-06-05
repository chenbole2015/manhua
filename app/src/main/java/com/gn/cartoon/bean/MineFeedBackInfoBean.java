package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/5/17.
 */

public class MineFeedBackInfoBean {

    private String titleFlag;

    private String content;

    private String time;

    public MineFeedBackInfoBean(String titleFlagArp, String contentArp, String timeArp) {
        titleFlag = titleFlagArp;
        content = contentArp;
        time = timeArp;
    }

    public String getTitleFlag() {
        return titleFlag;
    }

    public void setTitleFlag(String titleFlagArp) {
        titleFlag = titleFlagArp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String contentArp) {
        content = contentArp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String timeArp) {
        time = timeArp;
    }
}
