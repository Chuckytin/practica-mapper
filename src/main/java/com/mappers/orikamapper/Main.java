package com.mappers.orikamapper;

import com.mappers.orikamapper.dto.PersonCustomDTO;
import com.mappers.orikamapper.dto.PersonDefaultDTO;
import com.mappers.orikamapper.entities.Person;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class Main {

    /*
    // Orika Mapper - Default
    public static void main(String[] args) {

        //al utilizar Builder().build() permite muchas configuraciones
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(Person.class, PersonDefaultDTO.class);

        MapperFacade mapperFacade = mapperFactory.getMapperFacade();

        Person person = new Person(2L, "Javier", "Bernabé", "Javibe@gmail.com", (byte)31, 'M');
        System.out.println(person);

        PersonDefaultDTO personDefaultDTO =  mapperFacade.map(person, PersonDefaultDTO.class);
        System.out.println(personDefaultDTO);
    }
    */

    // Orika Mapper - Custom
    public static void main(String[] args) {

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(Person.class, PersonCustomDTO.class)
                .field("id", "idDTO")
                .field("name", "nameDTO")
                .field("lastName", "lastNameDTO")
                .field("email", "emailDTO")
                .field("age", "ageDTO")
                .field("gender", "genderDTO")
                .byDefault()
                .register();

        MapperFacade mapperFacade = mapperFactory.getMapperFacade();

        Person person = new Person(2L, "Javier", "Bernabé", "Javibe@gmail.com", (byte)31, 'M');
        System.out.println(person);

        PersonCustomDTO personCustomDTO = mapperFacade.map(person, PersonCustomDTO.class);
        System.out.println(personCustomDTO);

    }

}
