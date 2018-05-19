import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;

public class TestGetTestFromDB {


    @Test
    public void testMoreThanOneReturnValue()  {
        Iterator<String> i= mock(Iterator.class);
        when(i.next()).thenReturn("Mockito").thenReturn("rocks");
        String result= i.next()+" "+i.next();
        System.out.println(result);
        //assert
        assertEquals("Mockito rocks", result);
    }
/*

    @Mock
    MyDatabase databaseMock;


    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule();


    @Test
    public void testQuery()  {
        ClassToTest t  = new ClassToTest(databaseMock);

        boolean check = t.query("* from t");

        assertTrue(check);

        verify(databaseMock).query("* from t");

    }


    @Test
    public void testMoreThanOneReturnValue()  {
        Iterator<String> i= mock(Iterator.class);
        when(i.next()).thenReturn("Mockito").thenReturn("rocks");
        String result= i.next()+" "+i.next();
        //assert
        assertEquals("Mockito rocks", result);
    }

*/
}
