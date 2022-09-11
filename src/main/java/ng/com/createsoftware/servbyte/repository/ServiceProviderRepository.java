package ng.com.createsoftware.servbyte.repository;

import ng.com.createsoftware.servbyte.dao.ServiceProviderRequest;
import ng.com.createsoftware.servbyte.model.City;
import ng.com.createsoftware.servbyte.model.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Long> {


//    @Query(value="select * from service_provider s where s.city like %:query%", nativeQuery = true)
    @Query(value="select * from service_provider s where s.city like %:query%", nativeQuery=true)
   List<ServiceProvider> findByQuery(City query);




}
