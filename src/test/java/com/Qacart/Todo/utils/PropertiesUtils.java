package com.Qacart.Todo.utils;

import java.io.*;
import java.util.Properties;

public class PropertiesUtils {
    public  static Properties loadProperties(String filePath){
        File file =new File(filePath);
        try {
            InputStream inputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            return properties;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file not found");
        } catch (IOException e) {
            throw new RuntimeException("error when loading file");
        }
    }
}