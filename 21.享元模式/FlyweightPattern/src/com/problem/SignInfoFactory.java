package com.problem;

import java.util.HashMap;

public class SignInfoFactory {
    // 池容器
    private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();
    @Deprecated
    public static SignInfo getSignInfo()
    {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key)
    {
        // 设置返回对象
        SignInfo signInfo = null;
        if (!pool.containsKey(key))
        {
            System.out.println("建立对象，并放置到池中...");
            signInfo = new SignInfo4Pool(key);
            pool.put(key, signInfo);
        }else{
            signInfo = pool.get(key);
            System.out.println("直接从池中获取...");
        }
        return signInfo;
    }
}
