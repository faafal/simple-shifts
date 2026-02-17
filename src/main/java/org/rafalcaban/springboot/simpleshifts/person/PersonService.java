package org.rafalcaban.springboot.simpleshifts.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public PersonDto addPerson(PersonDto personDto) {
        Person personToSave = new Person();
        personToSave.setName(personDto.getName());
        personToSave.setSurname(personDto.getSurname());

        Person savedPerson = repository.save(personToSave);

        PersonDto responseDto = new PersonDto();
        responseDto.setId(savedPerson.getId());
        responseDto.setName(savedPerson.getName());
        responseDto.setSurname(savedPerson.getSurname());

        return responseDto;

    }

    public List<PersonDto> getAllPeople(){
        return repository.findAll()
                .stream()
                .map(person -> new PersonDto(person.getId(), person.getName(), person.getSurname()))
                .toList();
    }

    public void deletePerson(long personId){
        repository.deleteById(personId);
    }
}
