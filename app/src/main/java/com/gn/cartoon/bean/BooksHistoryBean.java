package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/5/16.
 */

public class BooksHistoryBean {
    private String readTime;

    private String title;

    private String titleSub;

    private String imagePath;

    private String pageRead;

    public BooksHistoryBean(String readTimeArp, String titleArp, String titleSubArp, String
            imagePathArp, String pageReadArp) {
        readTime = readTimeArp;
        title = titleArp;
        titleSub = titleSubArp;
        imagePath = imagePathArp;
        pageRead = pageReadArp;
    }

    public String getReadTime() {
        return readTime;
    }

    public void setReadTime(String readTimeArp) {
        readTime = readTimeArp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titleArp) {
        title = titleArp;
    }

    public String getTitleSub() {
        return titleSub;
    }

    public void setTitleSub(String titleSubArp) {
        titleSub = titleSubArp;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePathArp) {
        imagePath = imagePathArp;
    }

    public String getPageRead() {
        return pageRead;
    }

    public void setPageRead(String pageReadArp) {
        pageRead = pageReadArp;
    }
}
