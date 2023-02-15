package dean.project.UberDeluxe.controller;

import dean.project.UberDeluxe.data.dto.request.RegisterPassengerRequest;
import dean.project.UberDeluxe.data.dto.response.RegisterResponse;
import dean.project.UberDeluxe.services.PassengerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/passenger")
public class PassengerController {

    private final PassengerService passengerService;


    @PostMapping
    public ResponseEntity<?> register(@RequestBody RegisterPassengerRequest request) {
        RegisterResponse register = passengerService.register(request);
        return ResponseEntity.status(register.getCode()).body(register);
    }
}