package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.*;

import java.util.List;

@Projection(types = Feedback.class)
public interface ProjectionFeedback {
    Integer getId();

    User getUser();

    String getComment();

    Attachment getPhoto();

    List<Product> getProducts();

    List<Order> getOrders();
}
