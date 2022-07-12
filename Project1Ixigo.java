package com.maveric.assigment;

	import java.net.MalformedURLException;
	import java.net.URL;
	import java.time.Duration;
	

	
	import org.openqa.selenium.remote.DesiredCapabilities;


	import io.appium.java_client.AppiumBy;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.nativekey.AndroidKey;
	import io.appium.java_client.android.nativekey.KeyEvent;
	

	public class Project1Ixigo {

		public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stub
			
	       
			DesiredCapabilities cap=new DesiredCapabilities();
	        cap.setCapability("platformName", "android");
	        cap.setCapability("deviceName", "redmi");
	        cap.setCapability("app", "C:\\Users\\ashikr\\Appium\\appium_workspace\\AssessmentProjects\\app\\com.ixigo.train.ixitrain_2022-06-01.apk");

	        AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        driver.findElement(AppiumBy.xpath("//*[@text='English']")).click();
	        driver.findElement(AppiumBy.xpath("//*[@text='CONTINUE']")).click();
	        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@resource-id='com.ixigo.train.ixitrain:id/iv_cross_icon']")).click(); 
	        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@resource-id='com.ixigo.train.ixitrain:id/iv_close']")).click();
	        driver.findElement(AppiumBy.xpath("//*[@text='Search Trains']")).click();
	        
	        
	        driver.findElement(AppiumBy.xpath("//*[@resource-id='com.ixigo.train.ixitrain:id/iv_image']")).click();
	        driver.findElement(AppiumBy.xpath("//*[@text='Running Status']")).click();
	        driver.findElement(AppiumBy.xpath("//*[@text='PNR Status']")).click();

	        
	        
	               driver.findElement(AppiumBy.xpath("//*[@text='From']")).click();
	               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	               driver.findElement(AppiumBy.xpath("//*[@text='Deny']")).click();
	               driver.findElement(AppiumBy.xpath("//*[@text='Enter city/station name']")).click();
	               driver.findElement(AppiumBy.xpath("//*[@text='Enter city/station name']")).sendKeys("Thanjavur");
	               driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	               driver.pressKey(new KeyEvent(AndroidKey.ENTER));

	    		   
	    		   driver.findElement(AppiumBy.xpath("//*[@text='To']")).click();
	    		   driver.findElement(AppiumBy.xpath("//*[@text='Enter city/station name']")).sendKeys("Tambaram");
	    		   driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	               driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	               
	           	
	               
	               driver.findElement(AppiumBy.xpath("//*[@text='Search Trains']")).click();
	               
	               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	               driver.findElement(AppiumBy.xpath("//*[@text='UZHAVAN EXPRESS']")).click();
                String KM= driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.ixigo.train.ixitrain:id/tv_text'])[2]")).getText();
	    		System.out.println("Total distance train travelled is " +KM);
	    		   
	    	 
		}

		}

		
		




