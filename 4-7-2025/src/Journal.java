public class Journal extends Publication {
    private String journalName;
    private int year;
    private int volume;

    public Journal(String isbn, String type, String journalName, int year, int volume) {
        super(isbn, type);  // Call parent's constructor

        setJournalName(journalName);
        setYear(year);
        setVolume(volume);
    }

    // setter
    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // getter
    public String getJournalName() {
        return journalName;
    }

    public int getYear() {
        return year;
    }

    public int getVolume() {
        return volume;
    }

    public String getIsbn() {
        return (super.getIsbn());
    }

    public String getType() {
        return (super.getType());
    }

    // Display all the information
    public String displayInformation() {
        return String.format("\nJournal ISBN: %s\nJournal Type: %s\nJournal Name: %s\nPublish Year: %d\nVolume: %d\n",
                getIsbn(), getType(), getJournalName(), getYear(), getVolume());
    }
}
