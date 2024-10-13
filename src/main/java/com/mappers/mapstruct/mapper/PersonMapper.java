package com.mappers.mapstruct.mapper;

import com.mappers.mapstruct.dto.PersonCustomDTO;
import com.mappers.mapstruct.dto.PersonDefaultDTO;
import com.mappers.mapstruct.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

// para el funcionamiento del mapstruct
@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    //para el mapeo por default
    PersonDefaultDTO personToPersonDefaultDTO(Person person);

    //para el mapeo personalizado
    @Mapping(source = "id", target = "idDTO")
    @Mapping(source = "name", target = "nameDTO")
    @Mapping(source = "lastName", target = "lastNameDTO")
    @Mapping(source = "email", target = "emailDTO")
    @Mapping(source = "age", target = "ageDTO")
    @Mapping(source = "gender", target = "genderDTO")
    PersonCustomDTO personToPersonCustomDTO(Person person);
}
