package org.rafalcaban.springboot.simpleshifts.shift;

import org.springframework.data.jpa.repository.JpaRepository;

interface ShiftRepository extends JpaRepository<Shift, Long>{}