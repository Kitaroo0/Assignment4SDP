class PersonalObserver implements ContactObserver {
    @Override
    public void contactUpdate(Contact contact) {
        System.out.println("Regular contacts updated: " + contact);
    }
}