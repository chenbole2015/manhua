package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/6/7.
 */

public class HomeFocusBean {

    private String title;

    private String pauseNum;

    private String readPage;

    private String imagePath;

    public HomeFocusBean(String titleArp, String pauseNumArp, String readPageArp, String
            imagePathArp) {
        title = titleArp;
        pauseNum = pauseNumArp;
        readPage = readPageArp;
        imagePath = imagePathArp;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePathArp) {
        imagePath = imagePathArp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titleArp) {
        title = titleArp;
    }

    public String getPauseNum() {
        return pauseNum;
    }

    public void setPauseNum(String pauseNumArp) {
        pauseNum = pauseNumArp;
    }

    public String getReadPage() {
        return readPage;
    }

    public void setReadPage(String readPageArp) {
        readPage = readPageArp;
    }
}
