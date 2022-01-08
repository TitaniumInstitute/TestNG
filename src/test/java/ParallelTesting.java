import org.testng.annotations.Test;

public class ParallelTesting {
 @Test(threadPoolSize = 3, invocationCount = 3)
    public void test1() {
     System.out.println("Prueba corriendo en el hilo: " + Thread.currentThread().getId());

    }
    @Test
    public void test2() {
        System.out.println("Prueba corriendo en el hilo: " + Thread.currentThread().getId());

    }

    @Test
    public void test3() {
        System.out.println("Prueba corriendo en el hilo: " + Thread.currentThread().getId());

    }
}