import java.util.ArrayList;
import java.util.List;

public class Academician {
    private String id;
    private String name;
    private Address address;

    // Add publication list to hold wvery publication
    private List<Publication> publicationList = new ArrayList<>();

    public Academician(String id, String name, Address address) {
        setId(id);
        setName(name);
        setAddress(address);
    }

    // Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address address() {
        return address;
    }

    public String displayInformation() {
        return String.format("\nId: %s\nName: %s\nAddress: %s", getId(), getName(), address.displayInformation());
    }

    // Add publication function
    // parameter arrangement = isbn, type, journalName, year, volume
    public void addPublication(String isbn, String type) {
        Publication publication = new Publication(isbn, type);
        publicationList.add(publication);
    }
}
