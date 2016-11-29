package cn.joinhealth.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Created by linjian
 * 16/11/24
 * 数据源类型工具类
 */
public class DataSourceTypeUtil {
    private static final String PATH = "mybatis.properties";

    private static DataSourceTypeUtil instanse = new DataSourceTypeUtil();

    private Map<String, String> propertis;

    public static DataSourceTypeUtil getInstanse() {
        return instanse;
    }

    public int getDatasourceType(String datasource) {
        String temp = PropertiesUtil.getInstanse().get(datasource);
        String jdbcDriver = propertis.get(temp.substring(temp.indexOf('-') + 1)+".jdbc.driver");
        if (jdbcDriver.contains("oracle")){//1、oracle
            return 1;
        }else if (jdbcDriver.contains("jtds")){//2、sqlserver
            return 2;
        }else{//3、mysql
            return 3;
        }
    }

    private DataSourceTypeUtil() {
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

    public static void main(String[] args) {
        System.out.println(DataSourceTypeUtil.getInstanse().getDatasourceType(PropertiesUtil.getInstanse().get("getDiagDict")));
    }

}
