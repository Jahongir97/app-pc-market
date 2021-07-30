package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Blog;
import uz.pdp.apppcmarket.projection.ProjectionAddress;
import uz.pdp.apppcmarket.projection.ProjectionBlog;

@RepositoryRestResource(path = "blog", excerptProjection = ProjectionBlog.class)
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
