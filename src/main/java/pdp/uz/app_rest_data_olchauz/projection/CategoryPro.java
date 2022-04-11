package pdp.uz.app_rest_data_olchauz.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_rest_data_olchauz.entity.Category;

@Projection(types = Category.class)
public interface CategoryPro {
     int getId();

     String getName();

    String getDescription();
}
