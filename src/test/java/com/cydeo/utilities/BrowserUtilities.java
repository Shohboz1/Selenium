package com.cydeo.utilities;

public class BrowserUtilities {
    // Methods are static. Because we do not want to create an object to call those methods
    // We just want to call those methods with class name. That is why they are static type
    /**
     * This method is used to pause the code for given seconds
     * It is static method we can call with class name
     * BrowserUtils.sleep(3);
     * @param seconds
     */
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }
    }

}
