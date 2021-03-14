package ru.nixic.repository;

import org.springframework.stereotype.Repository;
import ru.nixic.dto.SchemaDto;
import ru.nixic.model.Level;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SchemaRepository {

    List<SchemaDto> schemaDtoList;

    public SchemaRepository() {
        schemaDtoList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            schemaDtoList.add(new SchemaDto(i, "schema_" + i, Level.getLevelByOrdinalId(i)));
        }
    }

    public SchemaDto getSchemaDtoById(Integer id)  {
        final SchemaDto schemaDto;
        try {
            schemaDto = schemaDtoList.get(id);
        } catch (Exception e) {
            throw new IllegalArgumentException("Сервис по уровню экспорта " + id + " не найдет");
        }
        return schemaDto;
    }
}
