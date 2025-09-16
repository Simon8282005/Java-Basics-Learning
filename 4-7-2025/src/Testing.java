public class Testing {
    public static void main(String[] args) {
        Academician academician = new Academician("A001", "Simon CY", new Address(15, "Jalan Marup", "Kuching"));
        System.out.println(academician.displayInformation());
        academician.addPublication("10000-8998-IN-04", "Horror");

        Publication publication = new Publication("10000-8998-IN-04", "Horror");
        publication.addToJournalList(new Journal(publication.getIsbn(), "Horror", "Hello World", 2025, 5));
        publication.addToJournalList(new Journal(publication.getIsbn(), "Science Fiction", "The end...", 2014, 100));
        publication.addToJournalList(new Journal(publication.getIsbn(), "Children", "The end...", 2023, 50));
        try {
            publication.print(publication.getJournalList(), "Hello");
        } catch (NotFoundError error) {
            System.out.println("Error occur....");
        }

    }
}
