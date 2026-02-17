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
    public Person addPerson(@RequestBody Person person) {
        return service.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return service.getAllPeople();
    }

    @DeleteMapping("/{personId}")
    public void deletePerson(@PathVariable long personId) {
        service.deletePerson(personId);
    }
}
