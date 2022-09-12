package ng.com.createsoftware.servbyte.service;

import lombok.AllArgsConstructor;
import ng.com.createsoftware.servbyte.model.Meal;
import ng.com.createsoftware.servbyte.model.ServiceProvider;
import ng.com.createsoftware.servbyte.repository.MealRepository;
import ng.com.createsoftware.servbyte.repository.ServiceProviderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MealServiceImpl implements MealService {

    private MealRepository mealRepository;
    private ServiceProviderRepository serviceProviderRepository;

    //get all meals
    @Override
    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    @Override
    public void addMeal(Meal meal, String uploadDir, MultipartFile multipartFile) throws IOException {
        Path uploadPath = Paths.get(uploadDir);

        if(!Files.exists(uploadPath)){
            Files.createDirectories(uploadPath);
        }

        try(InputStream inputStream = multipartFile.getInputStream()){
            Path filePath = uploadPath.resolve(meal.getPicture());
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
            mealRepository.save(meal);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            throw new IOException("Could not save Meal Picture file: " +meal.getPicture(), ex);
        }

    }


}
