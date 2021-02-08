public class Main {

    public static void main(String[] args) {
	//CustomerManager customerManager = new CustomerManager();
	//customerManager.Add();

	//EmployeeManager employeeManager = new EmployeeManager();
	//employeeManager.Delete();

        ProjectManager projectManager = new ProjectManager();
        projectManager.Add(new CustomerManager());

        ProjectManager projectManager1 = new ProjectManager();
        projectManager1.Add(new EmployeeManager());

        ProjectManager projectManager2 = new ProjectManager();
        projectManager2.Add(new InternManager());
    }
}
