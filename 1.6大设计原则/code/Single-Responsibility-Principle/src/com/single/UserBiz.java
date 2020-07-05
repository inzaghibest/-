package com.single;

public class UserBiz implements IUserBiz {
    @Override
    public boolean changePaword() {
        return false;
    }

    @Override
    public boolean deleteUser(IUserBO userBO) {
        return false;
    }

    @Override
    public void mapUser(IUserBO userBO) {

    }

    @Override
    public boolean addOrg(IUserBO userBO, int orgID) {
        return false;
    }

    @Override
    public boolean addRole(IUserBO userBO, int roleID) {
        return false;
    }
}
