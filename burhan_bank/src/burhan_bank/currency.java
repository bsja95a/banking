package burhan_bank;
import com.sun.ws.rest.api.client.*;
import javax.ws.rs.client.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;

public class currency {
     public currency(){

          Client client = ClientBuilder.newClient();
          WebTarget target = client.target("https://api.exchangeratesapi.io/latest?base=GBP");
          System.out.println(target.request(MediaType.TEXT_PLAIN_TYPE).get(String.class));
//          target.request(MediaType.TEXT_PLAIN_TYPE);


     }
}
