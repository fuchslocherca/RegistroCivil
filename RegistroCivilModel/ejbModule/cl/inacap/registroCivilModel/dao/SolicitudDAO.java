package cl.inacap.registroCivilModel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.registroCivilModel.dto.Solicitud;

/**
 * Session Bean implementation class SolicitudDAO
 */
@Stateless
@LocalBean
public class SolicitudDAO implements SolicitudDAOLocal {

	private List<Solicitud> solicitudes = new ArrayList<>();
  
 
	@Override
	public void save(Solicitud solicitud) {
		solicitudes.add(solicitud);
	
	}

	@Override
	public List<Solicitud> getAll() {
		return solicitudes;
	}

	@Override
	public void delete(Solicitud solicitud) {
		solicitudes.remove(solicitud);
		
	}

	@Override
	public List<Solicitud> filterBytipe(String tipo) {
return null;

}
}
