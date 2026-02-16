package org.rafalcaban.springboot.simpleshifts.shift;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ShiftRepository {

    private static final List<Shift> shifts = new ArrayList<>();
    private static Long counter = 0L;

    {
        shifts.add(new Shift(
                counter++,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(8L),
                2
        ));
        shifts.add(new Shift(
                counter++,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(8L),
                2
        ));
        shifts.add(new Shift(
                counter++,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(8L),
                3
        ));
    }

    public Shift addShift(Shift shift) {
        shift.setId(counter++);
        shifts.add(shift);
        return shift;
    }

    public List<Shift> getAllShifts(){
        return Collections.unmodifiableList(shifts);
    }

    public boolean deleteShift(long shiftId){
        return shifts.stream()
                .filter(s -> s.getId() == shiftId)
                .findFirst()
                .map(shifts::remove)
                .orElse(false);
    }

}
