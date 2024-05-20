package com.maju.pos.domain;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    /*
    Cart will not be used as a database entity, since it will
    only be used to store data temporarily, for each Sale.
     */
    private String productName;
    private String variantName;
    private Double salePrice;
    private Long quantity;
    private Double subTotal;
    private Double costPrice;
}
