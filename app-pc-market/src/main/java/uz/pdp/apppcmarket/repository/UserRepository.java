package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.User;
import uz.pdp.apppcmarket.projection.ProjectionAddress;
import uz.pdp.apppcmarket.projection.ProjectionUser;

@RepositoryRestResource(path = "user", excerptProjection = ProjectionUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
