package modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Singleton;

@Singleton
public class PersistenciaBasica {
	
	private long id;
	private Map<Long, Institucion> listaInstituciones;

	public PersistenciaBasica(){
		id = 0;
		listaInstituciones = new HashMap<>();
	}

	//CRUD Institucion
	public Institucion crearInstitucion(Institucion inst) {
		inst.setId(++id);
		listaInstituciones.put(id, inst);
		return inst;
	}
	
	public Collection<Institucion> listarInstituciones() {
		return listaInstituciones.values();
	}
	
	public Institucion buscarInstitucion(Long id) {			
		return listaInstituciones.get(id);
	}
	
	public Institucion actualizarInstitucion(Institucion inst){		
		if( listaInstituciones.containsKey(inst.getId()) ){
			listaInstituciones.put(inst.getId(), inst);
			return inst;
		}
		return null;
	}
	
	public boolean elminiarInstitucion(Long id){		
		if( listaInstituciones.containsKey(id) ){
			listaInstituciones.remove(id);
			return true;
		}		
		else return false;
	}

}
