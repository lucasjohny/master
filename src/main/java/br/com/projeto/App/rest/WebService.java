package br.com.projeto.App.rest;

import br.com.projeto.App.ejb.ContaBean;
import javax.ejb.EJB;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

@Path("/Projeto")
public class WebService {

    @EJB
    ContaBean conta;

    @GET
    @POST
    @Produces("application/json")
    public Response doGet(String t) {
        t = conta.atualizar(t);
        return Response.ok("Hello from WildFly Swarm!" + t).build();
    }

    @GET
    @POST
    @Produces("application/json")
    public Response doSet(String t) {
        conta.insere(t);
        return Response.ok("Hello from WildFly Swarm!" + t).build();
    }
}
