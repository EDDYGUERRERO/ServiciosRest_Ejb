package servicios.rest;

import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.*;

import modelo.Institucion;
import modelo.PersistenciaBasica;

@Path("/instituciones")
@Produces("application/json")
public class InstitucionRest {
	
	@Inject PersistenciaBasica persistenciaBasica;
	
	@GET
	@Produces("application/json")
	public Collection<Institucion> listar() {		
		return persistenciaBasica.listarInstituciones();
	}
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public Institucion buscar(@PathParam("id") Long pId ) {
	    System.out.println("buscando institucion con id: "+pId);
	    return persistenciaBasica.buscarInstitucion(pId);
	}
	
	@PUT
	@Consumes("application/json")
	@Produces("application/json")	
	public Institucion agregar(Institucion inst){
		persistenciaBasica.crearInstitucion(inst);
		return inst;
	}
		
	@DELETE
	@Path("{id}")
	public Response borrar(@PathParam("id") Long pId ) {
	System.out.println("eliminando institucion con id:"+ pId);
	    persistenciaBasica.elminiarInstitucion(pId);
	    return Response.noContent().build();
	}
		
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Institucion actualizar(Institucion inst) {
		persistenciaBasica.actualizarInstitucion(inst);
	    return inst;
	}

}
