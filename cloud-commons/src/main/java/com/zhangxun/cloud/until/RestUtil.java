package com.zhangxun.cloud.until;

import java.util.LinkedHashMap;

public class RestUtil {
    public static LinkedHashMap SUCCESS(Object data) {
        LinkedHashMap res = new LinkedHashMap();
        res.put("code", 20000);
        res.put("msg", "success");
        res.put("data", data);
        return res;
    }

    public static LinkedHashMap ERROR(int code, Object msg) {
        LinkedHashMap res = new LinkedHashMap();
        res.put("code", code);
        res.put("msg", msg);
        return res;
    }

    public static LinkedHashMap SUCCESS() {
        LinkedHashMap res = new LinkedHashMap();
        res.put("code", 20000);
        res.put("msg", "success");
        return res;
    }
}
