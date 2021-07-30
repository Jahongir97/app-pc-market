package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Attachment;
import uz.pdp.apppcmarket.entity.Category;
import uz.pdp.apppcmarket.entity.Product;

@Projection(types = Product.class)
public interface ProjectionProduct {

    Integer getId();

    String getName();

    boolean getActive();

    Category getCategory();

    Double getWarrantyYear();

    Double getPrice();

    Attachment getPhoto();


}
