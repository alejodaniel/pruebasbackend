package com.back.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.back.model.PrecioDetalle;
import com.back.service.IPrecioDetalleService;



@RestController
@RequestMapping("/api/precioDetalle")
public class PrecioDetallecontroller {
    
    @Autowired
    IPrecioDetalleService iPrecioDetalleService;

    @GetMapping(value ="/findAll",produces="application/json")
    public ResponseEntity<List<PrecioDetalle>>findAll(){
        List<PrecioDetalle>preciosDetalle=new ArrayList<>();
        preciosDetalle=iPrecioDetalleService.listar();
        return new ResponseEntity<List<PrecioDetalle>>(preciosDetalle,HttpStatus.OK);

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
