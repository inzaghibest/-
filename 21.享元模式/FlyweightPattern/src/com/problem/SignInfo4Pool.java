package com.problem;

public class SignInfo4Pool extends SignInfo {
    // 定义一个从对象池提取的key值
    private String key;

    public SignInfo4Pool(String key)
    {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
