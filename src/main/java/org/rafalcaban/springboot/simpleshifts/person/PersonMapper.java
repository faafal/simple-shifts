package org.rafalcaban.springboot.simpleshifts.person;

import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public PersonDto toDto(Person person){
        PersonDto personDto = new PersonDto();

        personDto.setId(person.getId());
        personDto.setName(person.getName());
        personDto.setSurname(person.getSurname());

        return personDto;
    }


    public Person toEntity(PersonDto personDto){
        Person person = new Person();

        person.setId(personDto.getId());
        person.setName(personDto.getName());
        person.setSurname(personDto.getSurname());


        return person;
    }

}
