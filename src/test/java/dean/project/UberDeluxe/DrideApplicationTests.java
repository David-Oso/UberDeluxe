package dean.project.UberDeluxe;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootTest
class DrideApplicationTests {

    @Test
    void contextLoads() {
    }
	@Test
	void testThatWeConnectWithDatabase() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource("");
	}
}
