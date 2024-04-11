package tests;

import dto.UserDTO;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    UserAPI userAPI = new UserAPI();

    UserDTO user = new UserDTO()
            .withUsername("nusy4@yandex.ru")
            .withPassword("Ilca*nu4");

    String token = "";
    @BeforeSuite
    public  void getToken(){
        Response response = userAPI.getResponseLoginUser(user);
        token = userAPI.getTokenFromResponse(response);
        System.out.println(token);

    }



}
