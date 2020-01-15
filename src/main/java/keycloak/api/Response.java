package keycloak.api;

public class Response {

  private final long id;
  private final String message;

  public Response(long id, String message) {
    this.id = id;
    this.message = message;
  }

  public long getId() {
    return id;
  }

  public String getMessage() {
    return message;
  }
}