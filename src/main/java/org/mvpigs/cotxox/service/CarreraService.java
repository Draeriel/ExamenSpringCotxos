package org.mvpigs.cotxox.service;

import org.formacio.repositori.Persona;
import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.repo.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraService {
	
	@Autowired
	CarreraRepo carrera = new CarreraRepo();
	Carrera carr = null;
	
	public Long crearCarrera(String id, String origen, String destino, int distancia, int tiempo_esperado) {
		carrera.crearCarrera(id, origen, destino, distancia, tiempo_esperado);
		return carrera.recupera(id);
	}
	
	public String recuperaCarrera(Long id) {
		return carrera.recupera(id);
	}
	
	public Carrera recuperaCarrera (String id) {
		 this.carr = new Carrera(id);
		return carrera.recupera(id);
	}
	
	public String getTarjetaCredito() {
		return carr.getTarjetaCredito();
	}
}
