package ng.com.createsoftware.servbyte.repository;

import ng.com.createsoftware.servbyte.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealRepository extends JpaRepository<Meal, Long> {
   List<Meal> findMealsByServiceProviderId(Long id);
}
