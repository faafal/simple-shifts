package org.rafalcaban.springboot.simpleshifts.shift;

import org.rafalcaban.springboot.simpleshifts.person.PersonDto;

import java.time.LocalDateTime;

public class ShiftDto {

    private Long id;
    private LocalDateTime shiftStartTime;
    private LocalDateTime shiftEndTime;
    private PersonDto personDto;

    public ShiftDto() {
    }

    public ShiftDto(Long id, LocalDateTime shiftStartTime, LocalDateTime shiftEndTime, PersonDto personDto) {
        this.id = id;
        this.shiftStartTime = shiftStartTime;
        this.shiftEndTime = shiftEndTime;
        this.personDto = personDto;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getShiftStartTime() {
        return shiftStartTime;
    }

    public LocalDateTime getShiftEndTime() {
        return shiftEndTime;
    }

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setShiftStartTime(LocalDateTime shiftStartTime) {
        this.shiftStartTime = shiftStartTime;
    }

    public void setShiftEndTime(LocalDateTime shiftEndTime) {
        this.shiftEndTime = shiftEndTime;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }
}
