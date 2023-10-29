class ContactFactory {
    public static Contact createContact(String firstName, String lastName, String phone, String type) {
        Contact contact = new Contact(firstName, lastName, phone);

        if (type=="personal") {
            contact.addObserver(new PersonalObserver());
        } else if (type=="work") {
            contact.addObserver(new WorkObserver());
        }
        else {
            System.out.println("Incorrect type of contact");
        }

        return contact;
    }
}