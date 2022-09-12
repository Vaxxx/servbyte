package ng.com.createsoftware.servbyte.controller;

import lombok.AllArgsConstructor;
import ng.com.createsoftware.servbyte.model.Meal;
import ng.com.createsoftware.servbyte.model.MealRequest;
import ng.com.createsoftware.servbyte.repository.MealRepository;
import ng.com.createsoftware.servbyte.repository.ServiceProviderRepository;
import ng.com.createsoftware.servbyte.service.MealService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/pages")
@AllArgsConstructor
public class MealController {

     MealService mealService;

//    @GetMapping("/serviceProvider/{id}/meals")
//    public String getAllMealsByServiceProviderId(@PathVariable(value = "id") Long id, Model model) {
//        if (!serviceProviderRepository.existsById(id)) {
//            throw new RuntimeException("Not found Service Provider with id = " + id);
//        }
//        //List<Meal> meals = mealRepository.findMealsByServiceProviderId(id);
//       // return new ResponseEntity<>(meals, HttpStatus.OK);
//
//        model.addAttribute("meals", mealRepository.findMealsByServiceProviderId(id));
//        return "pages/restaurant_details";
//    }

    //show meal form
    @GetMapping("/meal")
    public String showMealForm(Model model){
        model.addAttribute("meal", new Meal());
        return "/pages/add_meal";
    }

    //add a meal
    @PostMapping("/meals")
    public String addMeal(Meal meal, @RequestParam("image") MultipartFile multipartFile) throws IOException {

        String mealPath = StringUtils.cleanPath(multipartFile.getOriginalFilename());

        String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/src/main/resources/static/images/mealUploads/";

        meal.setPicture(mealPath);
        System.out.println("Meal id: " + meal.getDescription());
        String uploadDir = UPLOAD_DIRECTORY;

        mealService.addMeal(meal,uploadDir, multipartFile);

        return "redirect:/pages/meal?add";
    }

    //show all meals
    @GetMapping("/meals")
    public String showAllMeals(Model model) {
        model.addAttribute("meals", mealService.getAllMeals());
        return "/pages/meals";
    }

    @GetMapping("/showMeal")
    public String showMeal(@ModelAttribute("meal") MealRequest request, Model model){
       MealRequest rq = new MealRequest(request);
       String email = rq.getEmail();
       int index = rq.getIndex();
       double price = rq.getPrice();
        System.out.println("Email: " + email);
        System.out.println("index: " + index);
        System.out.println("price: " + price);
       return "pages/meal_order";
    }

}
