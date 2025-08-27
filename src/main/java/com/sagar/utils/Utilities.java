package com.sagar.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utilities {
    public File getFileObject(String filePath){
        String rootPath = System.getProperty("user.dir");
        File file = new File(rootPath + filePath);
        return file;
    }

    public FileReader getFileReader(File file){
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return  fileReader;
    }

    public Properties loadProperties(FileReader reader){
        Properties properties = new Properties();
        try {
            properties.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}
