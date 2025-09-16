import java.util.ArrayList;

public class Publication {
    private String isbn;
    private String type;

    // ArrayList use to store all the journal that has been public
    private ArrayList<Journal> journalList = new ArrayList<>();

    public Publication(String isbn, String type) {
        setIsbn(isbn);
        setType(type);
    }

    // Setter
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addToJournalList(Journal journal) {
        journalList.add(journal);
    }

    // Getter
    public String getIsbn() {
        return isbn;
    }

    public String getType() {
        return type;
    }

    public ArrayList getJournalList() {
        return journalList;
    }

    // Print out all the realate journal with the print() function
    // Search for the journal list by type
    public void print(ArrayList<Journal> journalList, String type) throws NotFoundError {
        // ArrayList<Journal> relatedJournal = new ArrayList<>();  // Copy the the journal list into relatedJournal list
        System.out.println("\nRealated journal: ");

        for (Journal journal : journalList) {
            if (journal.getType().equalsIgnoreCase(type)) {
                System.out.println(journal.displayInformation());
            } else {
                throw new NotFoundError("No related journal found. ");
            }
        }
    }
}
