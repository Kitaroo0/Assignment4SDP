import java.util.ArrayList;
import java.util.List;

class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private List<ContactObserver> observers = new ArrayList<>();

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public void addObserver(ContactObserver observer) {
        observers.add(observer);
    }

    public void updatePhone(String newPhoneNumber) {
        this.phone = newPhoneNumber;
        notifyObservers();
    }

    private void notifyObservers() {
        for (ContactObserver observer : observers) {
            observer.contactUpdate(this);
        }
    }

    @Override
    public String toString() {
        return "Contact: " + firstName + " " + lastName + ", Phone: " + phone;
    }
}