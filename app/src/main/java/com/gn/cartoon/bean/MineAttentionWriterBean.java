package com.gn.cartoon.bean;

/**
 * Created by FYJ on 2018/5/16.
 */

public class MineAttentionWriterBean {
    private String imagePath;
    private String nickName;
    private String userInfo;


    public MineAttentionWriterBean(String imagePathArp, String nickNameArp, String userInfoArp) {
        imagePath = imagePathArp;
        nickName = nickNameArp;
        userInfo = userInfoArp;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePathArp) {
        imagePath = imagePathArp;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickNameArp) {
        nickName = nickNameArp;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfoArp) {
        userInfo = userInfoArp;
    }
}
