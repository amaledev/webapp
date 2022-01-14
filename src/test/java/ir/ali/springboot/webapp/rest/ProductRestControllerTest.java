package ir.ali.springboot.webapp.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductRestControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void avgPriceShouldReturnValue() {
        double expectedResult = 60.5;
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/average?minWeight=2&maxWeight=80",
                Double.class)).isEqualTo(expectedResult);
    }
}
