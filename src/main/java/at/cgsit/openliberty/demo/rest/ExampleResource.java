package at.cgsit.openliberty.demo.rest;

import at.cgsit.openliberty.demo.rest.dto.TestDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.logging.Logger;

@Path("/hello")
public class ExampleResource {

    Logger LOG = Logger.getLogger(ExampleResource.class.getName());

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOG.info("hello: 1");
        return "Hello from RESTEasy ddf Reactive";

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/json")
    public TestDTO createDTO() {
        LOG.info("createDTO: 1");
        TestDTO dto = new TestDTO();
        dto.setName("Hans");
        dto.setVorname("Peter");
        return dto;
    }
}