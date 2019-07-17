package com.example.demo.model.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum OrderStatus {

    TODO(1, "TO DO"),
    IN_PROGRESS(2, "In Progress"),
    DONE(3, "DONE")
    ;

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    @JsonValue
    public  String getName() {
        return name;
    }

    @JsonCreator
    public static OrderStatus getByName(String name) {
        if (name == null) {
            return OrderStatus.TODO;
        }
        return Arrays.stream(values())
                .filter(x -> x.getName().toLowerCase().equals(name.toLowerCase()))
                .findFirst()
                .orElseThrow(null);
    }

    public static OrderStatus getById(Integer id) {
        if (id == null) {
            return OrderStatus.TODO;
        }
        return Arrays.stream(values())
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(null);
    }
}
