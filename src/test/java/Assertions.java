import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(ListenerConfig.class)
public class Assertions {

    int num1 = 1;
    int num2 = 2;
    int sum = num1 + num2;

    @Test(testName = "Prueba 1")
    public void test1 () {
        Assert.assertEquals(sum,3,"Mensaje del Assert");
        System.out.println("Suma correcta");
        Assert.fail();
    }

    @Test(testName = "Prueba 2")
    public void test2 () {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(sum, 89, "Mensaje del Assert");
        System.out.println("Soft Assert");
        softAssert.assertAll(); //Sin esta línea no es posible ver las excepciones

    }
}
//softAssert.assertAll(); //Sin esta línea no es posible ver las excepciones
