/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.KlinikHelper;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.Klinik;

/**
 * REST Web Service
 *
 * @author wewen
 */
@Path("klinik")
public class KlinikResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of KlinikResource
     */
    public KlinikResource() {
    }

    /**
     * Retrieves representation of an instance of service.KlinikResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        KlinikHelper helper = new KlinikHelper();
        List<Klinik> list = helper.getAllKlinik();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return Response.status(200)
                .entity(json)
                .build();
    }

    @POST
    @Path("addKlinik")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNewKlinik(String data) {
        Gson gson = new Gson();
        Klinik klinik = gson.fromJson(data, Klinik.class);
        KlinikHelper helper = new KlinikHelper();
        helper.addNewKlinik(
                klinik.getIdKlinik(),
                klinik.getNama(),
                klinik.getSpesialis());
        return Response.status(200)
                .entity(klinik)
                .build();
    }
    /**
     * PUT method for updating or creating an instance of KlinikResource
     *
     * @param content representation for the resource
     */
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void putJson(String content) {
//    }
}
