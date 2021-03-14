package ru.nixic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.nixic.model.Level;

@Data
@AllArgsConstructor
public class SchemaDto {

    private Integer id;
    private String name;
    private Level level;


}
