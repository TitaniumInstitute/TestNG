import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerConfig.class)
public class Dependency {
    @Test
    public void ponerPanBase () {
        System.out.println("Pan base colocado");
    }

    @Test (dependsOnMethods = "ponerPanBase")
    public void ponerAderezos () {
        System.out.println("Aderezos colocados");
        Assert.fail();

    }

    @Test (dependsOnMethods = "ponerPanBase")
    public void ponerJamon () {
        System.out.println("Jamón colocado");
    }

    @Test (dependsOnMethods = {"ponerPanBase", "ponerAderezos", "ponerJamon"})
    public void ponerPanTapa () {
        System.out.println("Pan tapa colocado");
    }
}
