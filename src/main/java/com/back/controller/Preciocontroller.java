package com.back.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.back.model.Precio;
import com.back.service.IPrecioService;



@RestController
@RequestMapping("/api/precio")
public class Preciocontroller {
    
    @Autowired
    IPrecioService iPrecioService;

    @GetMapping(value ="/findAll",produces="application/json")
    public ResponseEntity<List<Precio>>findAll(){
        List<Precio>precios=new ArrayList<>();
        precios=iPrecioService.listar();
        return new ResponseEntity<List<Precio>>(precios,HttpStatus.OK);

    }
    






    // //Create
    // @PostMapping("/save")
    // public User save(@RequestBody User user){
    //     return userService.save(user);
    // }

    // //Read
    //  @GetMapping("/{id}")
    // public User findById(@PathVariable long id){
    //      return userService.findById(id);
    //  }

    // //Update
    // @PutMapping("/update")
    // public User update(@RequestBody User user)
    // {
    //     return userService.save(user);
    // }

    // //Delete
    // @DeleteMapping("/deleteById/{id}")
    // @ResponseStatus(HttpStatus.NO_CONTENT)
    // public void delete(@PathVariable long id){
    //     userService.deleteById(id);
    // }

    // @GetMapping("/findByName/{term}")
    // public List<User> findByName(@PathVariable String term){
    //     return userService.findByName(term);
    // }


}
