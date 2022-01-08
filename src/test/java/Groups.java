import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListenerConfig.class)
@Test (groups = {"Suite1"})
public class Groups {
    @Test (groups = {"smoke", "regression", "defects", "backlog"})
    public void test1 () {
        System.out.println("Test1");
    }

    @Test (groups = {"smoke", "regression"})
    public void test2 () {
        System.out.println("Test2");
    }

    @Test (groups = {"backlog"})
    public void test3 () {
        System.out.println("Test3");
    }

    @Test (groups = {"defects.fixed"})
    public void test4 () {
        System.out.println("Test4");
    }

    @Test (groups = {"smoke", "defects.fixed"})
    public void test5 () {
        System.out.println("Test5");
    }
}
