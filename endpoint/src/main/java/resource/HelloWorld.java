package resource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.HashMap;
import java.util.Map;


//http://localhost:8080/employee

//http://localhost:8181/employee

/***
 * Declaration options:
 * - Without annotation JaxrsResource from whiteboard
 * @Component(service = EmployeeResource.class, property = {"osgi.jaxrs.resource=true"})
 * - With annotation JaxrsResource from whiteboard
 * @JaxrsResource
 * @Component(service = EmployeeResource.class)
 */

@JaxrsResource
@Component(service = HelloWorld.class)
@Path("/hello")
public class HelloWorld {

  @GET
  @Produces(APPLICATION_JSON)
  public Map<String, String> getValue() {
    HashMap<String, String> map = new HashMap<>();
    map.put("root", "rootValue");
    return map;
  }

}


