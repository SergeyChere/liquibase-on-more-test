package com.example.demo.model.web;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderRequest {

    private Integer orderTransitStatus;
    private Integer orderPaymentStatus;
    private Integer orderStatus;
}
