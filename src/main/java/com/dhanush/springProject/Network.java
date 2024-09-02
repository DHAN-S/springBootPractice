package com.dhanush.springProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Component("abc")
interface Network {
   void show();

}
@Component

class AB implements Network
{
    @Override
    public void show() {
        System.out.println("in AB");
    }
}
@Component
@Primary
class BC implements Network
{
    @Override
    public void show() {
        System.out.println("inside BC");
    }
}