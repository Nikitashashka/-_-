package model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal proteins;

    @Column(nullable = false)
    private BigDecimal fats;

    @Column(nullable = false)
    private BigDecimal carbohydrates;

    @Column(nullable = false)
    private BigDecimal calories;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ProductInfo> productInfos;

}