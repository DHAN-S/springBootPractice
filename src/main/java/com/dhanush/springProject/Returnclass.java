package com.dhanush.springProject;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Returnclass {
    @RequestMapping("/show")

    public String call()
    {
        System.out.println("itho vanthyten");
        return "Skillrack.html";
    }
    @RequestMapping()
    @ResponseBody


    public String   home()
    {
        return "Dear students,\n" +
                "\n" +
                " Milestone Assessment II Scheduled on 2.9.24 and the training was scheduled on 1.9.24.";
    }



}
//i can ue @controller ,but in return it will check for a page with that return name so i can use @restcontroller :here rest it used to serve the data from the server to the client,in olden days there is no rest so it will return data and layout but now rest give the state of the object that is "data"
//or i can use @controller @requestMapping down use @ResponseBody
