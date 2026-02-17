package org.rafalcaban.springboot.simpleshifts.shift;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shifts")
public class ShiftController {

    private final ShiftService service;

    public ShiftController(ShiftService service) {
        this.service = service;
    }

    @PostMapping
    public ShiftDto addShift(@RequestBody ShiftDto shiftDto) {
        return service.addShift(shiftDto);
    }

    @GetMapping
    public List<ShiftDto> getAllShifts() {
        return service.getAllShifts();
    }

    @DeleteMapping("/{shiftId}")
    public void deleteShift(@PathVariable long shiftId) {
        service.deleteShift(shiftId);
    }
}
