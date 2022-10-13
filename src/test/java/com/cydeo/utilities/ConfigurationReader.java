package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// This class is only 1 time we are creating in utilities package
// you will just call getProperty method with this class name
public class ConfigurationReader {
    //1. Create the object of properties is class.
    // We need properties class to use methods coming from class like load(), getProperty("key")
    // it is static because we using it in static method and static block
    // it is private because I will be using only in this class
    private static Properties properties = new Properties();

    // We want to open the properties file and load to properties ONLY ONCE before reading
    // having static block static runs first
    {
        try{
            //2. Create the object of FileInputStream
            // We need to object to open file as a stream in Java memory
            FileInputStream file = new FileInputStream("configuration.properties");

            //3. Load the properties object using FileInputStream object
            // Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);

            // close the file after loading
            // if we do not close the file, it will take space from computer memory like Scanner
            file.close();
        }catch (IOException e){

        }
    }

    /**
     * This method is used to read value from configuration.properties file
     * @param keyword -> key name configuration.properties file
     * @return -> value for the key. returns null if key is not found
     * driver.get(Configuration.properties.getProperty("env")
     */

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
