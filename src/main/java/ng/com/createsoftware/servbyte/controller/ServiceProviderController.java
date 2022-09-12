package ng.com.createsoftware.servbyte.controller;

import lombok.AllArgsConstructor;
import ng.com.createsoftware.servbyte.dao.ServiceProviderRequest;
import ng.com.createsoftware.servbyte.model.City;
import ng.com.createsoftware.servbyte.model.MealRestaurant;
import ng.com.createsoftware.servbyte.model.ServiceProvider;
import ng.com.createsoftware.servbyte.repository.MealRepository;
import ng.com.createsoftware.servbyte.service.MealService;
import ng.com.createsoftware.servbyte.service.ServiceProviderService;
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
public class ServiceProviderController {

    private ServiceProviderService service;
    private MealRepository mealRepository;

    private MealService mealService;

 ///show service providers by searching for cities
    @GetMapping("/restaurants/search")
    public String findByQuery(Model model, @Param("query") City query){
        model.addAttribute("serviceProvider", service.findByQuery(query));
        return "pages/service_provider_searched";
    }


    //add a service provider
    @PostMapping("/restaurants")
    public String addServiceProvider(ServiceProvider serviceProvider) throws IOException {
        service.addServiceProvider(serviceProvider);
        return "redirect:/pages/addRestaurant?add";
    }

    //show service provider form
    @GetMapping("/addRestaurant")
    public String showServiceProviderForm(Model model){
        model.addAttribute("serviceProvider", new ServiceProvider());
        return "/pages/add_service_provider";
    }

    //show meal _ service provider form
    @GetMapping("/meal_restaurant")
    public String showMealServiceProviderForm(Model model){
        model.addAttribute("serviceProviders", service.showAllServiceProvider());
        model.addAttribute("meals", mealService.getAllMeals());
        return "/pages/add_meal_service_provider";
    }

    //show all service providers
    @GetMapping("/restaurants")
    public String showAllRestaurants(Model model){
        model.addAttribute("serviceProvider", service.showAllServiceProvider());
        return "pages/service_provider";
    }

    //show restaurantById
    @GetMapping("/showRestaurantDetails/{id}")
    public String showRestaurantDetails(@PathVariable(value="id")Long id, Model model){
        model.addAttribute("serviceProvider", service.getServiceProviderById(id));
        model.addAttribute("meals", mealRepository.findMealsByServiceProviderId(id));
        return "pages/restaurant_details";
    }
}
