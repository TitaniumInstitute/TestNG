import org.testng.annotations.Test;

public class Priority {

    @Test(testName = "5")
    public void testOne() {
        System.out.println("Test4");
    }

    @Test(testName = "4")
    public void testTwo() {
        System.out.println("Test5");
    }

    @Test(testName = "2")
    public void testThree() {
        System.out.println("Test1");
    }

    @Test(testName = "1")
    public void testFour() {
        System.out.println("Test3");
    }

    @Test(testName = "3")
    public void testFive() {
        System.out.println("Test2");
    }
//
//    @Test (priority = 4)
//    public void testOne () {
//        System.out.println("Test1");
//    }
//
//    @Test (priority = 1)
//    public void testTwo () {
//        System.out.println("Test2");
//    }
//
//    @Test (priority = 3)
//    public void testThree () {
//        System.out.println("Test3");
//    }
//
//    @Test (priority = 4)
//    public void testFour () {
//        System.out.println("Test4");
//    }
//
//    @Test (priority = 5)
//    public void testFive () {
//        System.out.println("Test5");
//    }

}
