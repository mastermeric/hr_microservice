package com.hr.lockmanager.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LockController {
    // private final LockService lockService;

    // public MyController(LockService lockService) {
    //     this.lockService = lockService;
    // }

    // @PutMapping("/lock")
    // public String lock(){
    //     return lockService.lock();
    // }

    // @PutMapping("/properLock")
    // public String properLock(){
    //     return lockService.properLock();
    // }

    // @PutMapping("/failLock")
    // public String failLock(){
    //     lockService.failLock();
    //     return "fail lock called, output in logs";
    // }

    @GetMapping("test")
    public String test() {
        return  LocalDate.now() +   " OK..";
    }
}