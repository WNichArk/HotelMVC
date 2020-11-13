import java.sql.*;
import java.util.HashMap;

public class Model{
    private Room roomIn;
    private Customer custIn;
    public static HashMap <String, Customer> occupants = new HashMap<String, Customer>();
    String url = "jdbc:mysql://localhost:3306/mysql";

    private Connection connect;


    Model(){
    createRooms();
        try {
            this.connect = DriverManager.getConnection(url, "", "");
            System.out.println("Constructor connect: success");

        } catch (SQLException ex) {
            System.out.println("error in Model constructor! " + ex.getMessage());
        }

    }

   //////////////////////////////////////////////////////////////////////////////////////
    //TODO joins customer and room in hashmap, but not db yet
    public void putCustomer(String roomNum, Customer cust){
        //hashmap room+cust


        try {
            Statement statement  = connect.createStatement();
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS customer;");
            statement.executeUpdate("use customer;");
            statement.executeUpdate("insert into custInfo (firstName, lastName, phone, address, city, state, zip, nights, roomname)" +
                    " values ('"+cust.getFirstName() +"','"+cust.getLastName()+"','"+ cust.getPhone()+"','"+
                    cust.getAddress() +"','"+ cust.getCity() +"','"+ cust.getState()+"','"+ cust.getZip()+"','"+
                    cust.getNights()+"','"+cust.getRoomName()+"');");

            occupants.put(roomNum, cust);

        } catch (SQLException ex) {
            System.out.println("error in model.putCustomer! " + ex.getMessage());
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////
//TODO: CURRENTLY TRYING TO MAKE CUST RETURN DATA FROM DATABASE INSTEAD OF HASHMAP OF CUSTOMER - DONE
    public boolean isEmpty(String roomNum) {
        boolean empty = true;
        try {
            Statement statement = connect.createStatement();
            statement.executeQuery("use customer;");
            ResultSet results = statement.executeQuery("select * from custInfo where roomName='"+roomNum+"';");
            if (results.next()){
                empty = false;
            }
        } catch (Exception e) {
            System.out.println("Error in isEmpty: " + e.getMessage());
        }
        return empty;
    }

    public Customer getCustomer(String roomNum) {
        //Customer cust = occupants.get(roomNum);
        String f = "";
        String l= "";
        String p="";
        String a="";
        String c="";
        String s="";
        String z="";
        int n=0;
        int i =0;
        String r="";
        try {
            Statement statement = connect.createStatement();
            //statement.executeUpdate("CREATE DATABASE IF NOT EXISTS customer;");
            statement.executeUpdate("use customer;");
            ResultSet results = statement.executeQuery("select * from custInfo where roomname='"+roomNum+"';");
            //TODO THIS DOESN'T USE A KEY CURRENTLY
            //TODO GET ID (ADD ID TO CUSTINFO VIEW)
            //todo fix this while - maybe not using .next() method?
            if(results.next()) {
                //System.out.println(results.getString("firstname"));
                f =results.getString("firstname");
                l = results.getString("lastname");
                p = results.getString("phone");
                a = results.getString("address");
                c = results.getString("city");
                s = results.getString("state");
                z = results.getString("zip");
                n = results.getInt("nights");
                i = results.getInt("id");
                r = results.getString("roomName");


            }
        }catch(Exception e){
                System.out.println("Error in model.getcustomer:" + e.getMessage());
            }
        Customer cust = new Customer(f,l,p,a,c,s,z,n,r);
        System.out.println(cust.getId() + ", " + cust.getLastName());
        return cust;
        }


        /////////////////////////////////////////////////////////////////////
    public void checkOut(String roomChoice, Customer c){
        Customer custRemove = c;
        int id = custRemove.getId();
        String roomname = roomChoice;
        String phone = custRemove.getPhone();


        try {
            Statement statement  = connect.createStatement();
            statement.executeUpdate("use customer;");
            try{
            statement.executeUpdate("delete from custInfo where roomname = '"+ roomname +"';");}
            catch(Exception e){
                statement.executeUpdate("delete from custInfo where phone = "+ phone +";");
                System.out.println("Error in checkout via roomname. used phone.");
            }
        } catch (SQLException ex) {
            System.out.println("error in checkout! " + ex.getMessage());
        }
        occupants.remove(roomChoice);
    }



    void createRooms(){
        occupants.put("Room 1", null);
        occupants.put("Room 2", null);
        occupants.put("Room 3", null);
        occupants.put("Room 4", null);
        occupants.put("Room 5", null);
        occupants.put("Room 6", null);
        occupants.put("Room 7", null);
        occupants.put("Room 8", null);
        occupants.put("Room 9", null);
        occupants.put("Room 10", null);
    }


}




