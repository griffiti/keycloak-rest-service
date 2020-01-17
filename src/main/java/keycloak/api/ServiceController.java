package keycloak.api;

import java.util.concurrent.atomic.AtomicLong;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

  private final AtomicLong counter = new AtomicLong();

  // @CrossOrigin(origins = {"http://localhost"})
  @RequestMapping("/public")
  public Response pubic() {
    return new Response(counter.incrementAndGet(), "public");
  }

  // @CrossOrigin(origins = {"http://localhost"})
  @RequestMapping("/secured")
  public Response secured() {
    return new Response(counter.incrementAndGet(), "secured");
  }

  // @CrossOrigin(origins = {"http://localhost"})
  @RequestMapping("/admin")
  public Response admin() {
    return new Response(counter.incrementAndGet(), "admin");
  }
}