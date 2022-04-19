import com.div;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class DivTest {
    @Test
    public void divTest(){
        div d=new div();
        assertThrows(IndexOutOfBoundsException.class,()->d.div(1,0),"divide should throw");
    }
}
