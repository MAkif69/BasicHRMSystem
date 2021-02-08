public class EmployeeManager implements IPersonManager {
    @Override
    public void Add() {
        //Assume that we wrote codes about employer.
        System.out.println("Employer added");
    }

    @Override
    public void Delete() {
        System.out.println("Employer deleted");
    }
}
