package keycloak.api;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

  private final AtomicLong counter = new AtomicLong();

  @CrossOrigin()
  @RequestMapping("/public")
  public Response pubic() {
    return new Response(counter.incrementAndGet(), "public");
  }

  @CrossOrigin()
  @RequestMapping("/secured")
  public Response secured() {
    return new Response(counter.incrementAndGet(), "secured");
  }

  @CrossOrigin()
  @RequestMapping("/admin")
  public Response admin() {
    return new Response(counter.incrementAndGet(), "admin");
  }
}