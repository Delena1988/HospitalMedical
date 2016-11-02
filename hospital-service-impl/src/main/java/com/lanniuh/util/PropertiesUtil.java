package com.lanniuh.util;


import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * 读取Properties文件的工具类
 *
 * @author chenjialong
 * @date Aug 3, 2012
 */
public class PropertiesUtil {

    private static final String PATH = "config.properties";

    private static PropertiesUtil instanse = new PropertiesUtil();

    private Map<String, String> propertis;

    public static PropertiesUtil getInstanse() {
        return instanse;
    }

    public String get(String param){
    	return propertis.get(param);
    }

    private PropertiesUtil() {
        InputStream is = PropertiesUtil.class.getClassLoader().getResourceAsStream(PATH);
        propertis = new HashMap<String, String>();
        if (null == is) {
            return;
        }

        Properties props = new Properties();

        try {
            props.load(is);
            Set<Object> set = props.keySet();
            Iterator<Object> it = set.iterator();

            while (it.hasNext()) {
                String key = it.next().toString();
                Object value = props.get(key);
                String val = "";
                if (null != value) {
                    val = new String(value.toString().getBytes("ISO-8859-1"),
                            "UTF-8");
                    val = val.trim();
                }
                propertis.put(key, val);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
