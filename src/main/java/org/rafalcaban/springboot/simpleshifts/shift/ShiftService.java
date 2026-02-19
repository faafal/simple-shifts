package org.rafalcaban.springboot.simpleshifts.shift;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftService {

    private final ShiftRepository repository;
    private final ShiftMapper shiftMapper;

    public ShiftService(ShiftRepository repository, ShiftMapper shiftMapper) {
        this.repository = repository;
        this.shiftMapper = shiftMapper;
    }

    public ShiftDto addShift(ShiftDto shift) {
        Shift response = repository.save(shiftMapper.toEntity(shift));
        return shiftMapper.toDto(response);
    }

    public List<ShiftDto> getAllShifts(){
        return repository.findAll().stream().map(shift -> shiftMapper.toDto(shift) ).toList();
    }

    public void deleteShift(long shiftId){
        repository.deleteById(shiftId);
    }

}
