package e_shope;

import org.testng.annotations.Test;
import testng.BaseTest;

public class Function1 extends BaseTest {

    @Test (description = "Этот тест проверяет на наличие")
    public void test11(){

        System.out.println("Переход в корзину");
        System.out.println("Проверка продукта в корзине");
    }
}
