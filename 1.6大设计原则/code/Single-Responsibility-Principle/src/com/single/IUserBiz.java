package com.single;

// 负责用户的行为
public interface IUserBiz {
    public boolean changePaword();
    public boolean deleteUser(IUserBO userBO);
    public void mapUser(IUserBO userBO);
    public boolean addOrg(IUserBO userBO, int orgID);
    public boolean addRole(IUserBO userBO, int roleID);
}
