package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
         Example examples = (Example)context.getBean("example");
         System.out.println(examples);
         
         context.registerShutdownHook();
         // registering shutdown hook 
    }
}
