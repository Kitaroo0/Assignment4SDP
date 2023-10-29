public class Main {
    public static void main(String[] args) {
        Contact regularContact = ContactFactory.createContact("Sam", "Smith", "8-776-589-1487", "personal");
        Contact rusinessContact = ContactFactory.createContact("Rick", "Sanchez", "8-707-857-7954", "work");

        System.out.println(regularContact);
        System.out.println(rusinessContact);

        regularContact.updatePhone("8-727-657-7854");
        rusinessContact.updatePhone("8-707-987-5478");

        System.out.println(regularContact);
        System.out.println(rusinessContact);
    }
}