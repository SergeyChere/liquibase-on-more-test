package com.example.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public abstract class BaseDate extends BaseIdentification {

    @CreatedDate @Column(name = "CREATED_ON", nullable = false, updatable = false)
    private LocalDateTime createdOn;

    @LastModifiedDate @Column(name = "UPDATED_ON")
    private LocalDateTime updatedOn;
}
