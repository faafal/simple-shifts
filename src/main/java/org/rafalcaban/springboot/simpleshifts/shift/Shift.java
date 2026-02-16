package org.rafalcaban.springboot.shift;

import java.time.LocalDateTime;

public class Shift {

    private long id;
    private LocalDateTime shiftStartTime;
    private LocalDateTime shiftEndTime;
    private long employeeId;

    public Shift() {
    }

    public Shift(long id, LocalDateTime shiftStartTime, LocalDateTime shiftEndTime, long employeeId) {
        this.id = id;
        this.shiftStartTime = shiftStartTime;
        this.shiftEndTime = shiftEndTime;
        this.employeeId = employeeId;
    }

    public long getId() {
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

    public void setId(long id) {
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
