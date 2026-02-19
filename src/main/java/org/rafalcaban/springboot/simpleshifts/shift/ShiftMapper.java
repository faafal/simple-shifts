package org.rafalcaban.springboot.simpleshifts.shift;

import org.rafalcaban.springboot.simpleshifts.person.Person;
import org.rafalcaban.springboot.simpleshifts.person.PersonDto;
import org.springframework.stereotype.Component;

@Component
public class ShiftMapper {

    public ShiftDto toDto(Shift shift){
        ShiftDto shiftDto = new ShiftDto();
        PersonDto personDto = new PersonDto();

        if (shift.getPerson() != null) {
            personDto.setId(shift.getPerson().getId());
            personDto.setName(shift.getPerson().getName());
            personDto.setSurname(shift.getPerson().getSurname());
        }

        shiftDto.setId(shift.getId());
        shiftDto.setPersonDto(personDto);
        shiftDto.setShiftStartTime(shift.getShiftStartTime());
        shiftDto.setShiftEndTime(shift.getShiftEndTime());

        return shiftDto;
    }

    public Shift toEntity(ShiftDto shiftDto){
        Shift shift = new Shift();
        Person person = new Person();

        person.setId(shiftDto.getPersonDto().getId());
        person.setName(shiftDto.getPersonDto().getName());
        person.setSurname(shiftDto.getPersonDto().getSurname());

        shift.setPerson(person);
        shift.setShiftStartTime(shiftDto.getShiftStartTime());
        shift.setShiftEndTime(shiftDto.getShiftEndTime());

        return shift;
    }

}
