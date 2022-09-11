package ng.com.createsoftware.servbyte.service;

import ng.com.createsoftware.servbyte.dao.ServiceProviderRequest;
import ng.com.createsoftware.servbyte.model.City;
import ng.com.createsoftware.servbyte.model.ServiceProvider;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ServiceProviderService {


    List<ServiceProvider> showAllServiceProvider();

    List<ServiceProvider>findByQuery(City query);

    void addServiceProvider(ServiceProvider serviceProvider);

    ServiceProvider getServiceProviderById(Long id);

    void deleteServiceProviderById(Long id);
}
