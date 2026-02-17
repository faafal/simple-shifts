package org.rafalcaban.springboot.simpleshifts.shift;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftService {

    private final ShiftRepository repository;

    public ShiftService(ShiftRepository repository) {
        this.repository = repository;
    }

    public Shift addShift(Shift shift) {
        return repository.save(shift);
    }

    public List<Shift> getAllShifts(){
        return repository.findAll();
    }

    public void deleteShift(long shiftId){
        repository.deleteById(shiftId);
    }
}
