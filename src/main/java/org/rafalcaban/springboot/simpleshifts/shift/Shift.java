package org.rafalcaban.springboot.simpleshifts.shift;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Shift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime shiftStartTime;
    private LocalDateTime shiftEndTime;
    private long employeeId;

    public Shift() {
    }

    public Shift(Long id, LocalDateTime shiftStartTime, LocalDateTime shiftEndTime, long employeeId) {
        this.id = id;
        this.shiftStartTime = shiftStartTime;
        this.shiftEndTime = shiftEndTime;
        this.employeeId = employeeId;
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

    public long getEmployeeId() {
        return employeeId;
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

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
}
