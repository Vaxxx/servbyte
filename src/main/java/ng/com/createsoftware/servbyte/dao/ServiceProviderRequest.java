package ng.com.createsoftware.servbyte.dao;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.createsoftware.servbyte.model.City;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProviderRequest {

    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private City city;
    private String logo;
}
