package com.problem;

public class client {
    public static void main(String[] args)
    {
//        SignInfo signInfo = SignInfoFactory.getSignInfo();
        // 修改后的调用
        // 初始化池对象
        for (int i = 0; i<4; i++)
        {
            String subject = "科目: " + i;
            for (int j = 0; j<30; j++)
            {
                String key = subject + "地点: " + j;
                SignInfoFactory.getSignInfo(key);
            }
        }

        SignInfo signInfo = SignInfoFactory.getSignInfo("科目: 1地点: 20");
        // 如下使用
        signInfo.setId("2");
    }
}
