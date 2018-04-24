package com.spring.webservices.curso.service.impl;

import javax.jws.WebService;

import com.spring.webservices.curso.service.HolaMundoService;

@WebService(endpointInterface="com.spring.webservices.curso.service.HolaMundoService")
public class HolaMundoServiceImpl implements HolaMundoService {

	@Override
	public String saludaHola(String text) {
		System.out.println("Saluda: " + text);
		// TODO Auto-generated method stub
		return "Saluda: " + text;
	}

}
