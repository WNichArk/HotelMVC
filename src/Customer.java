public class Customer {


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        if (nights >= 0 && nights < 99999) {
            this.nights = nights;
        }else{
            this.nights = 404;
        }
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//todo ADD ID FIELD?
    public Customer(String firstName, String lastName, String phone, String address, String city, String state, String zip, int nights, String roomName) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
        setCity(city);
        setState(state);
        setZip(zip);
        setNights(nights);
        setRoomName(roomName);
    }



    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", nights=" + nights +
                ", balance=" + balance +
                '}';
    }

    private String firstName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private int nights;
    private double balance;
    private String lastName;
    private String phone;
    private String roomName;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;




}
