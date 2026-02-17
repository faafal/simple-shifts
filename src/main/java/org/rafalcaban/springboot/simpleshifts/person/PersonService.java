package org.rafalcaban.springboot.simpleshifts.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person addPerson(Person person) {
        return repository.save(person);
    }

    public List<Person> getAllPeople(){
        return repository.findAll();
    }

    public void deletePerson(long personId){
        repository.deleteById(personId);
    }
}
