package com.nestdigital.employeebackend.Controller;

import com.nestdigital.employeebackend.Dao.EmployeeDao;
import com.nestdigital.employeebackend.Model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.transaction.Transactional;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemployee",consumes = "application/json",produces = "application/json")
    public String addemployee(@RequestBody EmployeeModel employee){
        System.out.println(employee.toString());
        dao.save(employee);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewemployee")
    public List<EmployeeModel> viewemployee(){
        return (List<EmployeeModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deleteemployee",consumes = "application/json",produces = "application/json")
    public String deleteemployee(@RequestBody EmployeeModel employee){
        dao.deleteEmployeeById(employee.getId());
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchemployee",consumes = "application/json",produces = "application/json")
    public List<EmployeeModel> searchemployee(@RequestBody EmployeeModel employee){
        return (List<EmployeeModel>) dao.searchemployee(employee.getName());
    }
}
