import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class TestAddCommentToATest
{

        @Test
        public void TestAddCommentToATest() {

            Comment comment = new Comment("This is a comment", new Date());
            Prueba test = new Prueba("Test 1", "T1", "g/l");
            test.addComment(comment);

            // assert statements
            assertEquals(test.getComment().getTextComment(), comment.getTextComment(), "Mismo comentario");
        }


    @Test
    public void TestAddCommentToATestFailed() {

        Comment comment = new Comment();
        Prueba test = new Prueba("Test 1", "T1", "g/l");
        test.addComment(comment);

        // assert statements
        assertNotEquals(test.getComment().getTextComment(), comment.getTextComment(), "Mismo comentario");
    }

}
