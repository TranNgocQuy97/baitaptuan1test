import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    public void testCalculate() {
        // Kiểm tra kết quả của hàm calculate với đầu vào là 5
        assertEquals(0, Example.calculate(5));
    }
}
