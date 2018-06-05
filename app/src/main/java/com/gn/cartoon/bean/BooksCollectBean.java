package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/5/16.
 */

public class BooksCollectBean {

    private String imagePath;

    private String pageTotal;
    private String title;

    public BooksCollectBean(String imagePathArp, String pageTotalArp, String titleArp) {
        imagePath = imagePathArp;
        pageTotal = pageTotalArp;
        title = titleArp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titleArp) {
        title = titleArp;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePathArp) {
        imagePath = imagePathArp;
    }

    public String getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(String pageTotalArp) {
        pageTotal = pageTotalArp;
    }
}
