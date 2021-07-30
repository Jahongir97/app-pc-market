package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Character;
import uz.pdp.apppcmarket.projection.ProjectionCharacter;

@RepositoryRestResource(path = "character", excerptProjection = ProjectionCharacter.class)
public interface CharacterRepository extends JpaRepository<Character, Integer> {
}
