package com.dhanush.springProject;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.*;
@Service
public class Here {  static List<Products> p=new ArrayList<Products>();
  public void call(){

  Products ck=new Products(1,"Mouse");
  Products k=new Products(2,"key");
  Products c=new Products(3,"printer");
  p.add(ck);
  p.add(k);
  p.add(c);
    System.out.println(p);
  }
  public static Products getAll()
  {
    return p.get(1);
  }
}
