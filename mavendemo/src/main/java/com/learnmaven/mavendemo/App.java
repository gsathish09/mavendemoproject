package com.learnmaven.mavendemo;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    
	final static Logger logger=Logger.getLogger(App.class);
	public static void main( String[] args )
    {
       
		Calculator calc =new Calculator();
		logger.debug(calc.add(1, 2));
		logger.debug(calc.subtract(5, 2));
		logger.debug(calc.multiple(1, 2));
		logger.debug(calc.divide(10, 2));
        
    }
}
