package com.gn.cartoon.bean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/16.
 */

public class CommunityListBean {

    private String imagePath;
    private String nickName;
    private int state;
    private String conect;
    private List<String> mPhoto;
    private String time;
    private String proveNum;
    private String commectNum;

    public CommunityListBean(String imagePathArp, String nickNameArp, int stateArp, String
            conectArp, List<String> photoArp, String timeArp, String proveNumArp, String
            commectNumArp) {
        imagePath = imagePathArp;
        nickName = nickNameArp;
        state = stateArp;
        conect = conectArp;
        mPhoto = photoArp;
        time = timeArp;
        proveNum = proveNumArp;
        commectNum = commectNumArp;
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

    public int getState() {
        return state;
    }

    public void setState(int stateArp) {
        state = stateArp;
    }

    public String getConect() {
        return conect;
    }

    public void setConect(String conectArp) {
        conect = conectArp;
    }

    public List<String> getPhoto() {
        return mPhoto;
    }

    public void setPhoto(List<String> photoArp) {
        mPhoto = photoArp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String timeArp) {
        time = timeArp;
    }

    public String getProveNum() {
        return proveNum;
    }

    public void setProveNum(String proveNumArp) {
        proveNum = proveNumArp;
    }

    public String getCommectNum() {
        return commectNum;
    }

    public void setCommectNum(String commectNumArp) {
        commectNum = commectNumArp;
    }
}
