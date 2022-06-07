package com.example.api.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class MMember implements Serializable {
    private Integer memberId;

    private String firstName;

    private String lastName;

    private String passWord;

    private String initEmail;

    private String addressName;

    private Boolean adminFlag;

    private String createdBy;

    private LocalDateTime createdAt;

    private String updatedBy;

    private LocalDateTime updatedAt;

    private Boolean deleteFlag;

    private static final long serialVersionUID = 1L;
}