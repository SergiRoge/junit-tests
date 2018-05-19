import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestGetTestFromDB {


    @Mock
    private Prueba pruebaMock;


    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void testMoreThanOneReturnValue()  {

        Prueba prueba = new Prueba();//mock(Prueba.class);
        when(prueba.getNombre()).thenReturn("Prueba 1");
        //when(prueba.getComment()).thenReturn(new Comment());
        //assert
        assertTrue(true, "Pruebas iguales");

    }
}
