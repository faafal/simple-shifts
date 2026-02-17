package org.rafalcaban.springboot.simpleshifts.shift;

import jakarta.persistence.*;
import org.rafalcaban.springboot.simpleshifts.person.Person;

import java.time.LocalDateTime;

@Entity
public class Shift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime shiftStartTime;
    private LocalDateTime shiftEndTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;

    public Shift() {
    }

    public Shift(Long id, LocalDateTime shiftStartTime, LocalDateTime shiftEndTime, Person person) {
        this.id = id;
        this.shiftStartTime = shiftStartTime;
        this.shiftEndTime = shiftEndTime;
        this.person = person;
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

    public Person getPerson() {
        return person;
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

    public void setPerson(Person person) {
        this.person = person;
    }
}
