package health.care.booking.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")  // Activate the test profile
@TestPropertySource(properties = {
        "jwt.secret=hfaiehfisehfosndfejndfeswljrfeowfnjehwbewios4ngvhtrwglp4rkledf",
        "jwt.expirationMs=36000000"
})
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
