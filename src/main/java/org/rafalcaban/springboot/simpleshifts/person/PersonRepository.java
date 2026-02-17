package org.rafalcaban.springboot.simpleshifts.person;

import org.springframework.data.jpa.repository.JpaRepository;

interface PersonRepository extends JpaRepository<Person, Long>{}