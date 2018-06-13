package org.mvpigs.cotxox.repo;

import java.util.LinkedHashMap;
import java.util.Map;

import org.mvpigs.cotxox.domain.Carrera;
import org.springframework.stereotype.Repository;

@Repository
public class CarreraRepo {
	
	private Map<String, Carrera> bbdd = new LinkedHashMap<>();
	String id = "";
	
	public void crearCarrera(String id, String origen, String destino, int distancia, int tiempo_esperado) {
		bbdd.put(new Carrera(id, origen, destino, distancia, tiempo_esperado));
	}
	
	public Carrera recupera (String id) {
		return bbdd.get(id);
	}

	
}
