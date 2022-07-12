package com.maveric.assigment;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Project2AcademyBookmarks {

	public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap=new DesiredCapabilities();     
        cap.setCapability("platformName", "android");
        cap.setCapability("deviceName", "redmi");
        //cap.setCapability("appPackage", "org.khanacadmeny.android");
        //cap.setCapability("appActivity", "org.khanacadmeny.android.ui.library.MainActivity");
        cap.setCapability("app", "C:\\Users\\ashikr\\Appium\\appium_workspace\\AssessmentProjects\\app\\khan-academy-7-3-2.apk");
        
        AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Dismiss']")).click();
        driver.findElement(AppiumBy.xpath("//*[@text='Search']")).click();
        driver.findElement(AppiumBy.xpath("//*[@text='Life skills']")).click();
        
        Map<String,Object>map1=new HashMap<String,Object>();
        map1.put("strategy","-android uiautomator");
        map1.put("selector","UiSelector().textContains(\"Camp Khan\")");
        driver.executeScript("mobile: scroll",map1);
        driver.findElement(AppiumBy.androidUIAutomator("UiSelector().textContains(\"Camp Khan\")")).click();
        
        driver.findElement(AppiumBy.xpath("//*[@text='Camp Khan 2021']")).click();
        driver.findElement(AppiumBy.xpath("(//*[@content-desc='Add Bookmark'])[1]")).click();
     
        
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        driver.findElement(AppiumBy.xpath("//*[@text='Bookmarks']")).click();
        driver.findElement(AppiumBy.xpath("//*[@text='Edit']")).click();
        driver.findElement(AppiumBy.xpath("//*[@content-desc='Select bookmark']")).click();
        driver.findElement(AppiumBy.xpath("//*[@text='Delete']")).click();
        String text=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@index='3']")).getText();
        System.out.println(text);
        
       
		    
        
     
        
        
	}

}
