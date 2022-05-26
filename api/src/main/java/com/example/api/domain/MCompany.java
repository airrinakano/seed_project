package com.example.api.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class MCompany implements Serializable {
    private Integer companyId;

    private String companyName;

    private String systemLogin;

    private String sharedSecret;

    private String poUrl;

    private String cxmlId;

    private String cxmlPassword;

    private String createdBy;

    private LocalDateTime createdAt;

    private String updatedBy;

    private LocalDateTime updatedAt;

    private Boolean deleteFlag;

    private static final long serialVersionUID = 1L;
}