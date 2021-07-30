package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Category;

@Projection(types = Category.class)
public interface ProjectionCategory {
    Integer getId();

    String getName();

    boolean getActive();

    Category getParentCategory();
}
