package annotations;

import org.testng.Assert;
import org.testng.annotations.*;

public class SampleTest {

    @BeforeMethod
    public void DemoBefore(){
        System.out.println("Demo Before Method");
    }
    @Test
    public void demotest1() {
        System.out.println("Demo test1");
    }
    @Test
    public void demotest2() {
        System.out.println("Demo test2");
    }
    @Test (groups = "group1")
    public void demoGroup1(){
        System.out.println("Demo group1");
    }
    @Test (groups = "group2")
    public void demoGroup2() {
        System.out.println("Demo group2");
    }
    @AfterMethod
    public void DemoAfter(){
        System.out.println("Demo after Method");
    }
    @BeforeClass
    public void DemoBeforeClass() {
        System.out.println("Demo Before class");
    }
    @AfterClass
    public void DemoAfterClass() {
        System.out.println("Demo After class");
    }
    @BeforeTest
    public void DemoBeforeTest(){
        System.out.println("Demo Before Test");
    }
    @AfterTest
    public void DemoAfterTest(){
        System.out.println("Demo After Test");
    }
    @BeforeSuite
    public void DemoBeforeSuite(){
        System.out.println("Demo Before Suite");
    }
    @AfterSuite
    public void DemoBAfterSuite(){
        System.out.println("Demo After Suite");
    }
    @BeforeGroups
    public void demoBeforeGroups(){
        System.out.println("Demo Before Groups");
    }
    @AfterGroups
    public void demoAfterGroups(){
        System.out.println("Demo After Groups");
    }
    @BeforeGroups (groups = "group1")
    public void demoBeforeGroup1(){
        System.out.println("Demo Before group1");
    }
    @AfterGroups (groups = "group1")
    public void demoAfterGroup1(){
        System.out.println("Demo After group1");
    }
    @BeforeGroups (groups = "group2")
    public void demoBeforeGroup2(){
        System.out.println("Demo Before group2");
    }
    @AfterGroups (groups = "group2")
    public void demoAfterGroup2(){
        System.out.println("Demo After group2");
    }

}

