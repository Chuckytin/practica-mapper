package com.mappers.mapstruct;

import com.mappers.mapstruct.dto.PersonCustomDTO;
import com.mappers.mapstruct.dto.PersonDefaultDTO;
import com.mappers.mapstruct.mapper.PersonMapper;
import com.mappers.mapstruct.entities.Person;

public class Main {

    /*
    // Mapstruct - Default  _ Funciona con interfaces
    public static void main(String[] args) {

        Person person = new Person(3L, "Raquel", "Merced", "ramerced@gmail.com", (byte)22, 'F');
        System.out.println(person);

        PersonDefaultDTO personDefaultDTO = PersonMapper.INSTANCE.personToPersonDefaultDTO(person);
        System.out.println(personDefaultDTO);

    }
    */

    // Mapstruct - Custom
    public static void main(String[] args) {

        Person person = new Person(3L, "Raquel", "Merced", "ramerced@gmail.com", (byte)22, 'F');
        System.out.println(person);

        PersonCustomDTO personCustomDTO = PersonMapper.INSTANCE.personToPersonCustomDTO(person);
        System.out.println(person);

    }

}
