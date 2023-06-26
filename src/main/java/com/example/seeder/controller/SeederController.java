package com.example.seeder.controller;

import com.example.seeder.model.CashKick;
import com.example.seeder.model.CashKickRequest;
import com.example.seeder.model.Contract;
import com.example.seeder.model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/seeder/v1")
public class SeederController {

    @GetMapping("/contracts/{user_id}")
    public ResponseEntity<List<Contract>>  getContracts(@PathVariable("user_id") int userId){
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }

    @GetMapping("/payments/{user_id}")
    public ResponseEntity<List<Payment>> getPayments(@PathVariable("user_id") int userId){
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }

    @GetMapping("/cash-kicks/{user_id}")
    public ResponseEntity<List<CashKick>> getCashKicks(@PathVariable("user_id") int userId){
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }

    @PostMapping("/cash-kick")
    public ResponseEntity<CashKick> createCashKick(@RequestBody CashKickRequest request){
        return new ResponseEntity<>(new CashKick(), HttpStatus.OK);
    }
}
