package pdp.uz.app_rest_data_olchauz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_rest_data_olchauz.entity.Deliver;
import pdp.uz.app_rest_data_olchauz.projection.DeliverPro;

@RepositoryRestResource(path = "deliver",excerptProjection = DeliverPro.class)
public interface DeliverRepo extends JpaRepository<Deliver,Integer> {
}
