import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite (enabled = false)
    public void beforeSuite () {
        System.out.println("Este texto se ejecuta antes de la suite");
    }

    @BeforeTest (enabled = false)
    public void beforeTest () {
        System.out.println("Este texto se ejecuta antes de las pruebas");
    }

    @BeforeClass (enabled = false)
    public void beforeClass () {
        System.out.println("Este texto se ejecuta antes de las clases");
    }

    @BeforeMethod (enabled = false)
    public void beforeMethod () {
        System.out.println("Este texto se ejecuta antes de los métodos");
    }

    @Test
    public void test1 () {
        System.out.println("Este texto es una prueba");
    }

    @Test
    public void test2 () {
        System.out.println("Este texto es una prueba");
    }

    @Test
    public void test3 () {
        System.out.println("Este texto es una prueba");
    }
    @AfterMethod (enabled = false)
    public void afterMethod () {
        System.out.println("Este texto se ejecuta después de los métodos");
    }

    @AfterClass (enabled = false)
    public void afterClass () {
        System.out.println("Este texto se ejecuta después de las clases");
    }

    @AfterTest (enabled = false)
    public void afterTest () {
        System.out.println("Este texto se ejecuta después de las pruebas");
    }

    @AfterSuite
    public void afterSuite () {
        System.out.println("Este texto se ejecuta después de la suite");
    }
}
