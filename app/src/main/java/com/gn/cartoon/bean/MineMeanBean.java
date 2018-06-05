package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/5/15.
 */

public class MineMeanBean {
    private int iconMenu;

    private String textMenu;

    public MineMeanBean(int iconMenuArp, String textMenuArp) {
        iconMenu = iconMenuArp;
        textMenu = textMenuArp;
    }

    public int getIconMenu() {
        return iconMenu;
    }

    public void setIconMenu(int iconMenuArp) {
        iconMenu = iconMenuArp;
    }

    public String getTextMenu() {
        return textMenu;
    }

    public void setTextMenu(String textMenuArp) {
        textMenu = textMenuArp;
    }
}
