package com.marinete.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.json.JSONException;

import com.marinete.bean.Usuario;
import com.marinete.business.UsuarioBusiness;

@Path("/usuarioResource")
public class UsuarioResource {
	
	private UsuarioBusiness usuarioBusiness;

	@Path("/login")
	@POST
	@Consumes("application/json")
	@Produces("text/plain")
	public String login(Usuario usuario) throws JSONException {
		usuarioBusiness = new UsuarioBusiness();
		return usuarioBusiness.login(usuario);
	}

}