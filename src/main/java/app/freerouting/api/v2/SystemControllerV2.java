package app.freerouting.api.v2;

import app.freerouting.Freerouting;
import app.freerouting.management.gson.GsonProvider;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v2/system")
public class SystemControllerV2
{
  @GET
  @Path("/status")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getStatus()
  {
    return Response.ok("{}").build();
  }

  @GET
  @Path("/environment")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getEnvironment()
  {
    // Serialize the collected environment information to JSON and return it
    return Response.ok(GsonProvider.GSON.toJson(Freerouting.globalSettings.environmentSettings)).build();
  }
}