package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/5/15.
 */

public class HomeHotBooksBean {

    private String logoPath;

    private String title;


    private String detailInfo;

    public HomeHotBooksBean(String logoPathArp, String titleArp, String detailInfoArp) {
        logoPath = logoPathArp;
        title = titleArp;
        detailInfo = detailInfoArp;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPathArp) {
        logoPath = logoPathArp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titleArp) {
        title = titleArp;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfoArp) {
        detailInfo = detailInfoArp;
    }
}
