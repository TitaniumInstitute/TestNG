import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

    @DataProvider
    public Object[][] testData(){
        //Creación del objeto M*N
        Object[][] data = new Object[3][2];

        //Primer fila
        data[0][0] = "fer@titanium.com";
        data[0][1] = "3912873";

        //Segunda fila
        data[1][0] = "gil@titanium.com";
        data[1][1] = "lkjhsdf8";

        //Tercer fila
        data[2][0] = "jorge@titanium.com";
        data[2][1] = "lnds983";

        return data;
    }

    @DataProvider
    public Object[][] testData2(){
        return new Object[][] {
                {"fer@titanium.com","ds45", 1 },
                {"gil@titanium.com","456asd", 2},
                {"jorge@titanium.com","890890sakl", 3}
        };
    }

    @Test(dataProvider = "testData2")
    public void test(String user, String pwd, int id){
        System.out.println("El usuario es: " + user);
        System.out.println("Su contraseña es: "+pwd);
        System.out.println("Y su ID es: " + id);
    }

}
