package com.cardManagement.controller;

import com.cardManagement.model.Card;
import com.cardManagement.model.ServiceResponse;
import com.cardManagement.repository.ICardRepository;
import com.cardManagement.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/card")
@CrossOrigin("*")
public class CardController {

    @Autowired
    private ICardService iCardService;

    @GetMapping("/list")
    public ResponseEntity<List<Card>> list(){
        var result = iCardService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ServiceResponse> save(@RequestBody Card card){
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = iCardService.save(card);
        if(result==1){
            serviceResponse.setMessage("Item saved successfully");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<ServiceResponse> update(@RequestBody Card card){
        ServiceResponse serviceResponse =new ServiceResponse();
        int result = iCardService.update(card);
        if(result==1){
            serviceResponse.setMessage("Item updated successfully");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);

    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<ServiceResponse> update(@PathVariable int id){
        ServiceResponse serviceResponse =new ServiceResponse();
        int result = iCardService.deleteById(id);
        if(result==1){
            serviceResponse.setMessage("Item removed successfully");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);

    }
}
