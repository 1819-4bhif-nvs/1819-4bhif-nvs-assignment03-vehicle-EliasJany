package at.htl.vehicle.rest;

import at.htl.vehicle.model.vehicle;

import javax.ws.rs.*;
import java.util.*;

@Path("vehicle")
public class vehicleEndpoint {

    @GET
    @Path("{id}")
    public vehicle find(@PathParam("id") long id){
        return new vehicle("Opel " + id,"Commodore");
    }

    @GET
    public List<vehicle> getAll(){
        List<vehicle> all = new ArrayList<vehicle>();
        all.add(find(42));
        all.add(find(43));
        return all;
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") long id){
        System.out.printf("%d deleted",id);
    }

    @POST
    public void save(vehicle vehicle) {
        System.out.println("Vehicle = " + vehicle);
    }
}
