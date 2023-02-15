package dean.project.UberDeluxe.services;

import dean.project.UberDeluxe.data.dto.request.RegisterPassengerRequest;
import dean.project.UberDeluxe.data.dto.response.RegisterResponse;

public interface PassengerService {
    RegisterResponse register(RegisterPassengerRequest registerPassengerRequest);
}
