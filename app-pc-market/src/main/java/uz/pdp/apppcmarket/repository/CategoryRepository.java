package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Blog;
import uz.pdp.apppcmarket.entity.Category;
import uz.pdp.apppcmarket.projection.ProjectionBlog;
import uz.pdp.apppcmarket.projection.ProjectionCategory;

@RepositoryRestResource(path = "category", excerptProjection = ProjectionCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
