package ng.com.createsoftware.servbyte.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Table(name="service_provider")
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=2, max=40)
    private String name;

    @Email
    @NotBlank
    @Size(min=2, max=60)
    private String email;

    @NotBlank
    @Size(min=8, max=12)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name="city")
    private City city;


    @ManyToMany(fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name="meal_service_provider",
            joinColumns=@JoinColumn(
                    name="service_provider_id", referencedColumnName="id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name="meal_id", referencedColumnName="id"
            )
    )
    private Set<Meal> meals = new HashSet<>();


}
