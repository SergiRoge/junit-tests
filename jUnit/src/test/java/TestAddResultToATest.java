import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAddResultToATest {



    @Test
    public void TestAddCommentToATest() {

        Result result = new Result(12, new Date());
        Prueba test = new Prueba("Test 1", "T1", "g/l");
        test.addResult(result);

        assertEquals(test.getResult().getValorResultado(),12,"OKEY");

    }
    }
