package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void createNewUserTest(){
        User firstUser = new User("John", 30);
        Assert.assertNull(firstUser);
    }
    @Test(dependsOnMethods = "createNewUserTest")
    public void loginTest(){
        Assert.assertNotNull(true);
    }

    @DataProvider(name = "inputValues")
    public static Object[][]getInputValues(){
        return new Object[][]{
                {"john@gmail.com", "ValidPass"},
                {"john@mail.com", "ValidPass"},
                {"john@gmail.com", "InalidPas"}
        };
    }

    @Test(dataProvider = "inputValues")
    public void testLoginFun(String username, String password){
        System.out.println(username + " " + password);
    }
}
