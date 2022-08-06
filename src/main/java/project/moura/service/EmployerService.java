package project.moura.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.moura.models.EmployerModel;
import project.moura.repository.EmployerRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmployerService  {
    @Autowired
    EmployerRepository employerRepository;

    public ArrayList<EmployerModel> getemployers(){
        return (ArrayList<EmployerModel>) employerRepository.findAll();
    }

    public EmployerModel setemployer(EmployerModel employer){
        return employerRepository.save(employer);
    }
    public Optional<EmployerModel> getemployerbyid(Long id){
        return employerRepository.findById(id);
    }
    public EmployerModel putemployer(Long id,EmployerModel employer){
        employer.setId(id);
        return employerRepository.save(employer);
    }

    public Boolean deletebyid(Long id){
        try{
         employerRepository.deleteById(id);
         return true;
        }catch (Exception err) {
            return false;
        }}


}
