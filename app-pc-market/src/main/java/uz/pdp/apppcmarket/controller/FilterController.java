package uz.pdp.apppcmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.apppcmarket.entity.Character;
import uz.pdp.apppcmarket.entity.Product;
import uz.pdp.apppcmarket.repository.CharacterRepository;
import uz.pdp.apppcmarket.repository.ProductRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product/filter")
public class FilterController {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CharacterRepository characterRepository;

    @GetMapping
    private HttpEntity<?> getAllByFilter(@RequestParam Double minPrice,
                                         @RequestParam Double maxPrice,
                                         @RequestParam Optional<Collection<Integer>> idList) {
        List<Character> characterList = characterRepository.findAll();

        Collection<Integer> idsList = characterList.stream().map(Character::getId).collect(Collectors.toList());

        if (idList.isPresent()) {
            idsList = idList.get();
        }

        List<Product> products = productRepository.findAllByFilter(minPrice, maxPrice, idsList);
        return ResponseEntity.ok(products);

    }
}
