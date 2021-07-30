package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Product;
import uz.pdp.apppcmarket.entity.Supplier;

import java.util.List;

@Projection(types = Supplier.class)
public interface ProjectionSupplier {

    Integer getId();

    String getName();

    boolean getActive();

    String getEmail();

    List<Product> getProducts();
}
