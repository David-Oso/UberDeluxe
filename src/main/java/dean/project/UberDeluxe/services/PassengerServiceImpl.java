package dean.project.UberDeluxe.services;

import dean.project.UberDeluxe.MyMapper.MyMapper;
import dean.project.UberDeluxe.data.models.Details;
import dean.project.UberDeluxe.data.models.Passenger;
import dean.project.UberDeluxe.data.repositories.PassengerRepo;
import dean.project.UberDeluxe.data.dto.request.RegisterPassengerRequest;
import dean.project.UberDeluxe.data.dto.response.RegisterResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class PassengerServiceImpl implements PassengerService{
    private final PassengerRepo passengerRepo;      //"@AllArgsConstructor and final" instead of @Autowire

    //private ModelMapper modelMapper;

    @Override
    public RegisterResponse register(RegisterPassengerRequest registerPassengerRequest) {
        Details details = MyMapper.mapDetails(registerPassengerRequest);
        details.setLocalDateTime(LocalDateTime.now());

        //Details details = fillAppUser(registerPassengerRequest);

        return getRegisterResponse(details);
    }

    private RegisterResponse getRegisterResponse(Details details) {
        Passenger passenger = new Passenger();
        passenger.setDetails(details);
        Passenger savedPassenger = passengerRepo.save(passenger);
        RegisterResponse registerResponse = new RegisterResponse();
        registerResponse.setId(savedPassenger.getId());
        registerResponse.setCode(HttpStatus.CREATED.value());
        registerResponse.setSuccessful(true);
        registerResponse.setMessage("User Registration Successful");

        return registerResponse;
    }

    private static Details fillAppUser(RegisterPassengerRequest registerPassengerRequest) { //will use mappers instead
        Details details = new Details();
        details.setName(registerPassengerRequest.getName());
        details.setEmail(registerPassengerRequest.getEmail());
        details.setPassword(registerPassengerRequest.getPassword());
        return details;
    }
}
