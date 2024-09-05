package com.api.eshop.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.org.apache.xpath.internal.objects.XString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @Column(length = 500)
    private String seller;
    private int stock;

    private String rezj;

    private int price;
    private int priceWithDiscount = 0;
    private boolean incredibleOffers;
    private boolean dailySuggest;

    @Column(length = 1000)
    private String indexImageUrl;

    @OneToMany(mappedBy = "product" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JsonManagedReference("product")
    private List<ProductImages> images;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "Products_fk_1"))
    @JsonBackReference("category")
    private ProductsCategories category;

}
