public class Application {
    public static void main(String[] args) {
        new Application();
    }

    public Application() {
        //dbConnection connection = new dbConnection();
        Model m = new Model();
        Controller c = new Controller(m);
        CustomerView cv = new CustomerView(c, c.getRoomChoice());
        RoomView rv = new RoomView(c);
        rv.setVisible(true);
        //cv.setVisible(true);
    }

}

