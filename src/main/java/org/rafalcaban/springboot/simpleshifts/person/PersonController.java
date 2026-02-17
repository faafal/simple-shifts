package org.rafalcaban.springboot.simpleshifts.person;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public PersonDto addPerson(@RequestBody PersonDto personDto) {
        return service.addPerson(personDto);
    }

    @GetMapping
    public List<PersonDto> getAllPeople() {
        return service.getAllPeople();
    }

    @DeleteMapping("/{personId}")
    public void deletePerson(@PathVariable long personId) {
        service.deletePerson(personId);
    }
}
