package com.example.api.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class MProduct implements Serializable {
    private Integer productId;

    private String productName;

    private Integer unitPrice;

    private Integer tax;

    private String createdBy;

    private LocalDateTime createdAt;

    private String updatedBy;

    private LocalDateTime updatedAt;

    private Boolean deleteFlag;

    private static final long serialVersionUID = 1L;
}