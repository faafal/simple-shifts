package org.rafalcaban.springboot.simpleshifts.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonMapperTest {

    @Test
    public void shouldMapPersonDtoToPersonEntity(){
        PersonMapper personMapper = new PersonMapper();

        PersonDto personDto = new PersonDto();
        personDto.setId(1L);
        personDto.setName("Jan");
        personDto.setSurname("Kowalski");

        Person entity = personMapper.toEntity(personDto);

        Assertions.assertEquals("Jan",entity.getName());
    }

}