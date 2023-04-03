package e_shope;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testng.BaseTest;

public class Function2 extends BaseTest {

    @BeforeMethod
    public void openCatalog(){
        System.out.println("Переход в каталог");
    }

    @Test (description = "Этот тест проверяет на наличие", priority = 0)
    public void test21(){

        System.out.println("Проверка цены продукта");
    }
    @Test (priority = 1)
    public void test22(){

        System.out.println("Проверка названия продукта");
    }
}

