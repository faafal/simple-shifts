package org.rafalcaban.springboot.simpleshifts.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository repository;
    private final PersonMapper personMapper;


    public PersonService(PersonRepository repository, PersonMapper personMapper) {
        this.repository = repository;
        this.personMapper = personMapper;
    }

    public PersonDto addPerson(PersonDto personDto) {
        Person savedPerson = repository.save(personMapper.toEntity(personDto));
        return personMapper.toDto(savedPerson);

    }

    public List<PersonDto> getAllPeople(){
        return repository.findAll()
                .stream()
                .map(person -> personMapper.toDto(person))
                .toList();
    }

    public void deletePerson(long personId){
        repository.deleteById(personId);
    }
}
