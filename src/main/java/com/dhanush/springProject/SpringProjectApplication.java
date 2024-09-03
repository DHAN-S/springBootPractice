package com.dhanush.springProject;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class SpringProjectApplication {
	public static void main(String[] args) {
	ConfigurableApplicationContext context= SpringApplication.run(SpringProjectApplication.class, args);
	// to create a ioc container or called as spring container
   // ConfigurableApplicationContext  ithu oru interface ioc conatiner ya kondu varathuku
		//SpringApplication.run() ithu application srt panuthu aprm tomcat start,default configuratio lam
    //class path scan,namba just @Component than kudukurom ,spring do class path scan
    Home obj1=context.getBean(Home.class);
	 //bean means reusable component
   // Home obj2=context.getBean(Home.class);
	 //scope default singleton so only once constructor work,if not we use prototype
	 obj1.connect();
	// obj2.connect();
		Here h=new Here();
		h.call();
	}
}
//object graph :means relation between object(dependeccy)