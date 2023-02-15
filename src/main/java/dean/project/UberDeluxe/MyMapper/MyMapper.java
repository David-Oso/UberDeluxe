package dean.project.UberDeluxe.MyMapper;

import dean.project.UberDeluxe.data.models.Details;
import dean.project.UberDeluxe.data.dto.request.RegisterPassengerRequest;

public class MyMapper {
    public static Details mapDetails(RegisterPassengerRequest request) {
        Details details = new Details();
        details.setName(request.getName());
        details.setPassword(request.getPassword());
        details.setEmail(request.getEmail());
        return details;
    }
}
