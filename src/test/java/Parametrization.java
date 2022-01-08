import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
    @Test
    @Parameters({"parameterFromXML"})
    public void testParameter (@Optional String parameterFromXML) {
        System.out.println("My parameter from XML is: " + parameterFromXML);
    }

}
