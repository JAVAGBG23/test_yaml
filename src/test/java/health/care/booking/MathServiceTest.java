package health.care.booking;

import health.care.booking.services.MathService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MathServiceTest {

        @InjectMocks
        private MathService mathService;

        @BeforeEach
        public void setup() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
        public void testAdd() {
            // Arrange
            int a = 5;
            int b = 3;

            // Act
            int result = mathService.add(a, b);

            // Assert
            assertEquals(8, result, "5 + 3 should equal 8");
        }

}
