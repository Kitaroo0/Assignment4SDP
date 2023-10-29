class WorkObserver implements ContactObserver {
    @Override
    public void contactUpdate(Contact contact) {
        System.out.println("Business contacts updated: " + contact);
    }
}