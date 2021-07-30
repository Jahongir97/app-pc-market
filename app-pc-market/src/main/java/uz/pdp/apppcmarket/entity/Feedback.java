package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private User user;

    @Column(nullable = false)
    private String comment;

    @ManyToOne
    private Attachment photo;

    @ManyToMany
    private List<Product> products;

    @ManyToMany
    private List<Order> orders;

}
