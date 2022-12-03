import spiffyUrlManipulator //import library

public class ServerController() {
    private String rootURL = "http://zipcode.rocks:8085";

    private ServerController svr = new ServerController();


    private ServerController() {}

    public ServerController shared() {
        return svr;
    } //Caro: took out static and added ServerController to return

    public JsonString idGet() {
        // url -> /ids/
        // send the server a get with url
        // return json from server
    }
    public JsonString idPost(Id) {
        // url -> /ids/
        // create json from Id
        // request
        // reply
        // return json
    }
    public JsonString idPut(Id) {
        // url -> /ids/
    }


}

// ServerController.shared.doGet()