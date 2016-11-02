package com.sve.calculator.war.configuration;

import java.util.HashSet;
import java.util.Set;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;

import com.sve.calculator.war.arithmetic.Subtraction;
import com.sve.calculator.war.arithmetic.addition;
import com.sve.calculator.war.arithmetic.division;
import com.sve.calculator.war.arithmetic.multiplication;

public class configuration implements ServerApplicationConfig{


	@Override
	public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> scanned) {
		Set<Class<?>> results = new HashSet<>();
		 if (scanned.contains(addition.class)) {
			 results.add(addition.class);
		 }
		 
		 if(scanned.contains(Subtraction.class)){
			 results.add(Subtraction.class);
		 }
		 
		 if(scanned.contains(multiplication.class)){
			 results.add(multiplication.class);
		 }
		 
		 if(scanned.contains(division.class)){
			 results.add(division.class);
		 }
		 
        return results;
        /**/
		
	}

	@Override
	public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> arg0) {
		// TODO Auto-generated method stub
		//Set<ServerEndpointConfig> result = new HashSet<>();
		//result.add(ServerEndpointConfig.Builder.create(EchoEndPoint.class, "/echo").build());
		//return result;
		return null;
	}
}
