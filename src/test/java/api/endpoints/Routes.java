package api.endpoints;

/**
 * @author Ahmed Bughra
 * @create 2023-08-18  9:49 PM
 *
 *
 * Swagger URL https://petstore.swagger.io
 *
 *  Create User (POST) : https://petstore.swagger.io/v2/users
 *  Get User (GET) : https://petstore.swagger.io/v2/users/{username}
 *  Update User (PUT) : https://petstore.swagger.io/v2/users/{username}
 *  Delete User (DELETE) : https://petstore.swagger.io/v2/users/{username}
 *
 *
 *
 */
public class Routes {
    public static String base_url = "https://petstore.swagger.io/v2";

    // User Module
    public static String post_url = base_url + "/user";
    public static String get_url = base_url + "/user/{username}";
    public static String update_url = base_url + "/user/{username}";
    public static String delete_url = base_url + "/user/{username}";

    // Store Module
            // Here you will create store module urls
    // Pet Module
            // Here you will create pet module urls
}
