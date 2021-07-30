package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Property;

@Projection(types = Property.class)
public interface ProjectionProperty {
    Integer getId();

    String getName();

    boolean getActive();

    String getDescription();

}
