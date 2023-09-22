package com.runtrack.db.PersonRepository;
import com.runtrack.db.Person.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
