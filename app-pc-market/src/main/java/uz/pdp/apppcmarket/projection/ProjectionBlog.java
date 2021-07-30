package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Attachment;
import uz.pdp.apppcmarket.entity.Basket;
import uz.pdp.apppcmarket.entity.Blog;
import uz.pdp.apppcmarket.entity.Product;

import java.util.List;

@Projection(types = Blog.class)
public interface ProjectionBlog {
    Integer getId();

    String getHeader();

    String getBodyText();

    Attachment getPhoto();
}
