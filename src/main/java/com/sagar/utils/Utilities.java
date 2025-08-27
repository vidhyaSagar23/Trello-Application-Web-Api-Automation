package com.sagar.utils;

import java.io.*;
import java.util.Properties;

public class Utilities {
    /**
     * Load properties file from resources folder
     * @param fileName name of the properties file
     * @return Properties object
     */
    public Properties loadProperties(String fileName) {
        Properties properties = new Properties();

        // Load file from classpath
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                throw new RuntimeException("File not found in resources: " + fileName);
            }
            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load properties file: " + fileName, e);
        }

        return properties;
    }
}
