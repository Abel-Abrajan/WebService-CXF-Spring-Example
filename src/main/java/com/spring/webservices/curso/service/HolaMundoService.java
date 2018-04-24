package com.spring.webservices.curso.service;

import javax.jws.WebService;

@WebService
public interface HolaMundoService {
	
	String saludaHola(String text);
}
