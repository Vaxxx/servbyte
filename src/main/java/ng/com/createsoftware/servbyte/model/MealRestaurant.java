package ng.com.createsoftware.servbyte.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MealRestaurant {

    private Long serviceProviderId;
    private Long mealId;
}
