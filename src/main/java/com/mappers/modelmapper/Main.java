package com.mappers.modelmapper;

import com.mappers.modelmapper.dto.PersonCustomDTO;
import com.mappers.modelmapper.dto.PersonDefaultDTO;
import com.mappers.modelmapper.entities.Person;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class Main {

    /*
    // Model Mapper - Default
    public static void main(String[] args) {

        ModelMapper modelMapper = new ModelMapper();

        Person person = new Person(1L, "Santiago", "Marcelo", "santimar@gmail.com", (byte)25, 'M');
        System.out.println(person);

        PersonDefaultDTO personDefaultDTO = modelMapper.map(person, PersonDefaultDTO.class); //convierte el person a un PersonDefaultDTO
        System.out.println(personDefaultDTO);

        //output:
        //Person{id=1, name='Santiago', lastName='Marcelo', email='santimar@gmail.com', age=25, gender=M}
        //PersonDefaultDTO{id=1, name='Santiago', lastName='Marcelo', email='santimar@gmail.com', age=25, gender=M}

    }
    */

    // Model Mapper - Custom  _  Cuando tienen atributos con distinto nombre:
    public static void main(String[] args) {

        ModelMapper modelMapper = new ModelMapper();

        //permite mapear propiedades con nombres diferentes
        TypeMap<Person, PersonCustomDTO> propertyMapper = modelMapper.createTypeMap(Person.class, PersonCustomDTO.class);
        propertyMapper.addMapping(Person::getId, PersonCustomDTO::setIdDTO); //el primero llama al GET el segundo al SET
        propertyMapper.addMapping(Person::getName, PersonCustomDTO::setNameDTO);
        propertyMapper.addMapping(Person::getLastName, PersonCustomDTO::setLastNameDTO);
        propertyMapper.addMapping(Person::getEmail, PersonCustomDTO::setEmailDTO);
        propertyMapper.addMapping(Person::getGender, PersonCustomDTO::setGenderDTO);

        Person person = new Person(1L, "Santiago", "Marcelo", "santimar@gmail.com", (byte)25, 'M');
        System.out.println(person);

        PersonCustomDTO personCustomDTO =  propertyMapper.map(person);
        System.out.println(personCustomDTO);

    }

}
