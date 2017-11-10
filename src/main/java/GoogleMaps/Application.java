package GoogleMaps;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;

@Controller
@EnableAutoConfiguration
public class Application {

    private static final String URL = "http://maps.googleapis.com/maps/api/geocode/json";


    public ArrayList<Coordinates> coordinates;

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

//RequestParam
    // PathVariable


    @RequestMapping("/address")
    @ResponseBody
    public Geometry retrieveaddress(@RequestParam("address") String address) throws IOException {

        String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + address + "&key=AIzaSyDtXgbStTgq9y_0i4QF-4Nw8dAgRa4fvyY";

        RestTemplate restTemplate = new RestTemplate();

        String strResult = restTemplate.getForObject(url, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jNode = objectMapper.readTree(strResult);
        JsonNode jresult = jNode.get("results").get(0).get("geometry");
        Geometry result = objectMapper.treeToValue(jresult, Geometry.class);
        //GoogleResponse result = objectMapper.readValue(strResult, GoogleResponse.class);

        return result;
    }

    @RequestMapping(value = "/location/{location}/{radius123}", method = RequestMethod.GET)

    @ResponseBody
    public GoogleResponse SearchRequest(@PathVariable("location") String location, @PathVariable("radius123") String radius) throws IOException {

        String searchurl = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=" + location + "&radius=" + radius + "&key=AIzaSyDtXgbStTgq9y_0i4QF-4Nw8dAgRa4fvyY";

        RestTemplate restTemplate = new RestTemplate();

        String strResult = restTemplate.getForObject(searchurl, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        GoogleResponse result = objectMapper.readValue(strResult, GoogleResponse.class);

        return result;

    }

    @RequestMapping("/nearby")
    @ResponseBody
    public String radiusrange(@RequestParam("location") String location) throws IOException {

        String searchurl = "https://maps.googleapis.com/maps/api/place/radarsearch/json?location=" + location + "&type=cafe&keyword=vegetariankey=AIzaSyDtXgbStTgq9y_0i4QF-4Nw8dAgRa4fvyY";

        RestTemplate restTemplate = new RestTemplate();

        String strResult = restTemplate.getForObject(searchurl, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        GoogleResponse result = objectMapper.readValue(strResult, GoogleResponse.class);

        return "nearby places";

    }
}











