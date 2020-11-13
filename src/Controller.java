public class Controller {
    private Model model;
    private Customer cust;

    private boolean occ;
    private String roomChoice;

    public Controller(Model m) {
        this.model = m;
    }

    public void setCustomer(String f, String l, String p, String a, String c, String s, String z, int n, String commandName) {

        this.cust = new Customer(f, l, p, a, c, s, z, n, commandName);
        model.putCustomer(roomChoice, this.cust);

    }
    public Customer getCustomer(String clickedRoom){
        cust = model.getCustomer(clickedRoom);
        return cust;
    }
    public boolean isEmpty(String roomNum){
        //todo search database
        boolean empty = model.isEmpty(roomNum);  //returns a null without customer in roomMap
        return empty;
    }
    public void roomChoice(String roomNum){
        this.roomChoice = roomNum;
    }
    public String getRoomChoice(){
        return roomChoice;
    }
    public void checkOut(String roomChoice, Customer custo){
        model.checkOut(roomChoice, custo);
    }


}



