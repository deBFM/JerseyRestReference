package ds;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/* Und nun kann man mit der URL: http://localhost:8080/MyRestfulProject/resources/hello
 * darauf zugreifen und braucht keine web.xml mehr.
 * @author BFM
 */

@ApplicationPath("resources")
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("com.vogella.jersey.first");
    }
}