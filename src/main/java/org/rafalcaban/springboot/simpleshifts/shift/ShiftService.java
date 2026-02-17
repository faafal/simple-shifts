package org.rafalcaban.springboot.simpleshifts.shift;

import org.rafalcaban.springboot.simpleshifts.person.Person;
import org.rafalcaban.springboot.simpleshifts.person.PersonDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftService {

    private final ShiftRepository repository;

    public ShiftService(ShiftRepository repository) {
        this.repository = repository;
    }

    public ShiftDto addShift(ShiftDto shift) {
        Shift response = repository.save(mapToShift(shift));
        ShiftDto responseDto = mapToShiftDto(response);
        return responseDto;
    }

    public List<ShiftDto> getAllShifts(){
        return repository.findAll().stream().map(shift -> mapToShiftDto(shift) ).toList();
    }

    public void deleteShift(long shiftId){
        repository.deleteById(shiftId);
    }

    private ShiftDto mapToShiftDto(Shift shift){
        ShiftDto shiftDto = new ShiftDto();
        PersonDto personDto = new PersonDto();

        if (shift.getPerson() != null) {
            personDto.setId(shift.getPerson().getId());
        }

        shiftDto.setId(shift.getId());
        shiftDto.setPersonDto(personDto);
        shiftDto.setShiftStartTime(shift.getShiftStartTime());
        shiftDto.setShiftEndTime(shift.getShiftEndTime());

        return shiftDto;
    }

    private Shift mapToShift(ShiftDto shiftDto){
        Shift shift = new Shift();
        Person person = new Person();

        person.setId(shiftDto.getPersonDto().getId());

        shift.setPerson(person);
        shift.setShiftStartTime(shiftDto.getShiftStartTime());
        shift.setShiftEndTime(shiftDto.getShiftEndTime());

        return shift;
    }

}
