package project.moura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.moura.models.EmployerModel;
import project.moura.service.EmployerService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/employer")
public class EmployerControll {

    @Autowired
    EmployerService service;

    @GetMapping
    public ArrayList<EmployerModel> all(){
        return service.getemployers();
    }
    @PostMapping
    public EmployerModel setemployer(@RequestBody EmployerModel employer){
        return this.service.setemployer(employer);
    }

    @PutMapping(path = "/{id}")
    public EmployerModel update(@PathVariable("id") Long id,@RequestBody EmployerModel employer){

        return this.service.putemployer(id,employer);
    }

    @GetMapping(path = "/{id}")
    public Optional<EmployerModel> findbyid(@PathVariable("id") Long id){

        return service.getemployerbyid(id);
    }

    @DeleteMapping (path = "/{id}")
    public Boolean delete(@PathVariable("id") Long id){
        return service.deletebyid(id);
    }






}
