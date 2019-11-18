package com.app;

import com.pl.model.enums.EPayment;
import lombok.*;

import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private EPayment payment;

    @OneToMany(mappedBy = "payment")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<CustomerOrder> customerOrders;

}
