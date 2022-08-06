package project.moura.repository;


import org.springframework.data.repository.CrudRepository;
import project.moura.models.EmployerModel;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface EmployerRepository extends CrudRepository<EmployerModel,Long> {

}
