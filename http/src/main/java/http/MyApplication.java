package http;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsApplicationBase;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsName;

import javax.ws.rs.core.Application;

@Component(service = Application.class)
@JaxrsApplicationBase("my-app")
@JaxrsName("MyApplication")
public class MyApplication extends Application {
}
