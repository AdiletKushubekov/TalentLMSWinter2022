package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
    @BeforeSuite
    public void setup(){
        System.out.println("chrome");
    }
    @BeforeTest
    public  void openSite(){
        System.out.println("open site");
    }
    @AfterTest (alwaysRun = true)
    public void close(){
        System.out.println("close site");
    }
}
