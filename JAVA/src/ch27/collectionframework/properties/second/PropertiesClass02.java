package ch27.collectionframework.properties.second;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesClass02 {

    public static void main(String[] args) {

        Properties properties = new Properties();
        FileInputStream fis = null;

        try {
            // FileInputStream : 파일을 읽음
            fis = new FileInputStream("src/ch27/collectionframework/properties/second/conf.properties");
            properties.load(fis);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(properties);

        properties = new Properties();
        properties.put("a", "windows");
        properties.put("b", "android");
        properties.put("c", "ios");
        properties.put("d", "unix");
        properties.put("e", "linux");

        FileOutputStream fos = null;

        try {
            // FileInputStream : 파일을 읽음
            fos = new FileOutputStream("src/ch27/collectionframework/properties/second/conf.properties");
            properties.store(fos, "setting");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

}
