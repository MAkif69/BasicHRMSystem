public class CustomerManager implements IPersonManager{
    @Override
    public void Add() {
        //Assume that wrote codes about customer.
        System.out.println("Customer added");
    }

    @Override
    public void Delete() {
        System.out.println("Customer deleted");
    }
}
