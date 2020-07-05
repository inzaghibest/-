package com.single;


public class MainUserInfo {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        IUserBO userBO = (IUserBO) userInfo;
        userBO.setPassword("123");
        IUserBiz userBiz = (IUserBiz)userInfo;
        userBiz.addOrg(userBO, 10);
    }
}
