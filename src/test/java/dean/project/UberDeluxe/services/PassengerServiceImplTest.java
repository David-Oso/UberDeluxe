package dean.project.UberDeluxe.services;

import dean.project.UberDeluxe.data.dto.request.RegisterPassengerRequest;
import dean.project.UberDeluxe.data.dto.response.RegisterResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PassengerServiceImplTest {
    @Autowired
    PassengerService passengerService;

    @BeforeEach
    void setUp() {

    }
    @Test
    void registerTest() {
        RegisterPassengerRequest request = new RegisterPassengerRequest();
        request.setName("Dean");
        request.setPassword("password");
        request.setEmail("@gmail");
        RegisterResponse register = passengerService.register(request);
        assertThat(register).isNotNull();
        assertThat(register.getCode()).isEqualTo(HttpStatus.CREATED.value());
    }

}