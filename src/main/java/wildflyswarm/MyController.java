package wildflyswarm;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class MyController {

  @GET
  public String get() {
    return "OK";
  }

}
