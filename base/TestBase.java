package com.guru99.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public TestBase()
    {
        try {
            prop = new Properties();
            //FileInputStream ip = new FileInputStream(System.getProperty("C:\\Users\\user\\IdeaProjects\\comGuru99\\" +
                   // "src\\main\\java\\com\\guru99\\config\\config.properties"));
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/guru99"
                    + "/config/config.properties");
             prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void initialization() {
              String browserName = prop.getProperty("browser");
              if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reshma\\Chromedriver.exe");
            driver = new ChromeDriver();

        }

          else if(browserName.equals("Firefox")){
        	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Reshma\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
          driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
          driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));



    }



}
