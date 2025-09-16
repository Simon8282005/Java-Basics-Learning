public class Address {
    private int no;
    private String street;
    private int postcode;
    private String city;

    public Address(int no, String street, int postcode, String city) {
        setNo(no);
        setStreet(street);
        setPostcode(postcode);
        setCity(city);
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNo() {
        return no;
    }

    public String getStreet() {
        return street;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }
}
