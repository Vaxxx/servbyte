package ng.com.createsoftware.servbyte.service;

import lombok.AllArgsConstructor;
import ng.com.createsoftware.servbyte.dao.ServiceProviderRequest;
import ng.com.createsoftware.servbyte.model.City;
import ng.com.createsoftware.servbyte.model.ServiceProvider;
import ng.com.createsoftware.servbyte.repository.ServiceProviderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceProviderServiceImpl  implements ServiceProviderService{

    private ServiceProviderRepository repository;



    @Override
    public List<ServiceProvider> showAllServiceProvider() {
       return repository.findAll();
    }

    @Override
    public List<ServiceProvider> findByQuery(City query) {
        return repository.findByQuery(query);
    }

    @Override
    public void addServiceProvider(ServiceProvider serviceProvider) {
        repository.save(serviceProvider);
    }


    //GET SERVICE PROVIDER BY ID
    @Override
    public ServiceProvider getServiceProviderById(Long id) {
        Optional<ServiceProvider> optionalServiceProvider = repository.findById(id);
        ServiceProvider serviceProvider = null;
        if(optionalServiceProvider.isPresent()) {
            serviceProvider = optionalServiceProvider.get();
        }
        else
            throw new RuntimeException("Service Provider Not Found");
        return serviceProvider;
    }

    @Override
    public void deleteServiceProviderById(Long id) {

    }
}
