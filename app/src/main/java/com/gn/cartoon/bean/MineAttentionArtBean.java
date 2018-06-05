package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/5/16.
 */

public class MineAttentionArtBean {
    private String imagePath;
    private String title;
    private String titleSub;
    private String updatePage;

    public MineAttentionArtBean(String imagePathArp, String titleArp, String titleSubArp, String
            updatePageArp) {
        imagePath = imagePathArp;
        title = titleArp;
        titleSub = titleSubArp;
        updatePage = updatePageArp;
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

    public String getTitleSub() {
        return titleSub;
    }

    public void setTitleSub(String titleSubArp) {
        titleSub = titleSubArp;
    }

    public String getUpdatePage() {
        return updatePage;
    }

    public void setUpdatePage(String updatePageArp) {
        updatePage = updatePageArp;
    }
}
