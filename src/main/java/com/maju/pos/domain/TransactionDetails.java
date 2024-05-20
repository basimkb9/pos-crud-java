package com.maju.pos.domain;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TransactionDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "transaction_id", referencedColumnName = "id")
    private Transaction transaction;
    @ManyToOne
    @JoinColumn(name = "variant_id", referencedColumnName = "id")
    private Variant variant;
    private Double unitPrice;
    private Double costPrice;
    private Long quantity;
    private Double subTotal;
    private Double profit;
}
