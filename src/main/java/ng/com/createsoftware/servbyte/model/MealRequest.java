package ng.com.createsoftware.servbyte.model;

import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class MealRequest {

    private int index;
    private String email;
    private double price;

    public MealRequest(MealRequest request) {
        this.index = request.getIndex();
        this.email = request.getEmail();
        this.price = request.getPrice();
    }
}
