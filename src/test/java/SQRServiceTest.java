import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRServiceTest.csv")
    void testSQRservice(String str, int lowerBorder, int upperBorder, int expected) {
        SQRService service = new SQRService();

        int actual = service.HowManySqr(lowerBorder, upperBorder);
        Assertions.assertEquals(expected, actual);
    }
}
