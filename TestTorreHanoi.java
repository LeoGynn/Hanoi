
import org.junit.Test;
import static org.junit.Assert.*;

public class TestTorreHanoi {

    @Test
    public void testResolverHanoi3Discos() {
        TorreHanoi torre = new TorreHanoi();
        torre.resolverHanoi(3, 'A', 'C', 'B');
        assertEquals(7, torre.getQuantidadeMovimentos());
    }

    @Test
    public void testResolverHanoi4Discos() {
        TorreHanoi torre = new TorreHanoi();
        torre.resolverHanoi(4, 'A', 'C', 'B');
        assertEquals(15, torre.getQuantidadeMovimentos());
    }
