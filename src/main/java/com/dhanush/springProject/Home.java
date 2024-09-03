package com.dhanush.springProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//defult value=singleton ya irukum ,getBean()ulla classname.class nu kudupom so athu spring container ulla irukanu pakum apdi iruntha eduthu tharam evlo time object create panalum orae classfile ya tha anga irukum so duplicate ya object cretaee panathu ithuku peru than singleton  scope ipo namaku ella time um object create panra apo new ya ioc continer ull create aganum na @Scpe value("prototype")nu kudukanum

public class Home {
   // @Autowired
    // private Network varaiable
    //ipdiyum pannalam ithu field injection
//we can specify the component name by @Qualifier("abc")
    private Network variable;

//ithu construictor in jectikon
    Home(Network variable){
        this.variable=variable;
        System.out.println("inside home");

    }
    private String owner;
    private int doorNo;
    public int getDoorNo()
    {
        return doorNo;
    }
    public void setDoorNo(int doorNo)

    {
        this.doorNo=doorNo;
    }
    public String getOwner()
    {
        return owner;
    }
    public void setOwner(String owner)

    {
        this.owner=owner;
    }
    public void connect()
    {
        System.out.println("going to connect internet");
        variable.show();
    }

}
