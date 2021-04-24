package com.everis.logback_reto_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rdiahern
 * 
 * Reto Logback
 *
 */
public class App {
	
	/**
	 * LOGGER
	 */
	
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	/**
	 * 
	 * Método ejemplo
	 * 
	 */
	
    public static void main( String[] args ){
    	
    	LOGGER.info("Comenzamos el método");
    	
    	//Iteración de prueba
        for(int i=0; i <= 4520; i++) {
        	
        	LOGGER.debug("Iteración número: {}" , i);
        }
        
        LOGGER.info("Terminamos el método");
    }
}
