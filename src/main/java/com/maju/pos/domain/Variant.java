package com.maju.pos.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Variant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double costPrice;
    private Double salePrice;
    private Long quantity;
    private String barcode;
    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id", nullable = false)
    private Product product;
}
