package ng.com.createsoftware.servbyte.service;

import ng.com.createsoftware.servbyte.model.Meal;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface MealService {

    //get all Meals
    List<Meal> getAllMeals();

    void addMeal(Meal meal, String uploadDir, MultipartFile multipartFile) throws IOException;
}
