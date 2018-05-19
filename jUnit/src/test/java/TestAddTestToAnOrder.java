import org.junit.jupiter.api.Test;

public class TestAddTestToAnOrder {



    @Test
    public void TestAddCommentToATest() {


        Order order = new Order();

        Prueba test = new Prueba();
        Prueba test2 = new Prueba();

        order.addTest(test);
        order.addTest(test2);


    }
}
