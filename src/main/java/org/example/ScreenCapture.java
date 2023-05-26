package org.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.example.StoreName.driver;

public class ScreenCapture {

    public static void passScreenCapture() throws IOException
    {
        Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrFile,  new File("C:\\Projects\\StoreNameMandatoryCheck\\screenshot\\"+sdf.format(d)+".png"));
    }

}