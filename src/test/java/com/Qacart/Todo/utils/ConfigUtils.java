package com.Qacart.Todo.utils;

import net.bytebuddy.implementation.bytecode.Throw;

import java.util.Properties;

public class ConfigUtils {
    private  Properties properties;
    private static ConfigUtils configUtils;

    private ConfigUtils() {
       String env= System.getProperty("env","production");
       switch (env){
           case "PRODUCTION":
               properties=PropertiesUtils.loadProperties("src/test/java/com/Qacart/Todo/config/production.properties");
               break;
           case "LOCAL":
               properties=PropertiesUtils.loadProperties("src/test/java/com/Qacart/Todo/config/local.properties");
               break;
           default:
               throw new RuntimeException("Environment is not supported");
       }

    }
    public static ConfigUtils getInstance(){
        if (configUtils==null){
            configUtils=new ConfigUtils();
        }
        return configUtils;
    }
    public  String getBaseUrl(){
       String prop= properties.getProperty("baseurl");
       if (prop != null)return prop;
        throw new RuntimeException("could not find the base url inside property file");
    }
    public  String getemail(){
        String prop= properties.getProperty("email");
        if (prop != null)return prop;
        throw new RuntimeException("could not find the email inside property file");
    }
    public  String getpassword(){
        String prop= properties.getProperty("password");
        if (prop != null)return prop;
        throw new RuntimeException("could not find the password inside property file");
    }

}
