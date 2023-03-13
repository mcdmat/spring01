package com.spring01.doctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class DoctorController {
    @GetMapping("/doctor/1")
    @ResponseBody
    public String firstPage(){
    return "William Hartnell";
    }
    @GetMapping("/doctor/10")
    @ResponseBody
    public String secondPage(){
        return "David Tennant";
    }
    @GetMapping("/doctor/13")
    @ResponseBody
    public String thirdPage(){
        return "Jodie Whittaker";
    }
}
