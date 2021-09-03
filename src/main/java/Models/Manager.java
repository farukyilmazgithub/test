package Models;

public class Manager extends Employee{
    private Integer number_of_employees;

    public Manager(String name, String surname, Integer number_of_employees) {
        super(name, surname);
        this.number_of_employees = number_of_employees;
    }

    public Integer getNumber_of_employees() {
        return number_of_employees;
    }

    public void setNumber_of_employess(Integer number_of_employees) {
        this.number_of_employees = number_of_employees;
    }
    @Override
    public void showinfos(){
        System.out.println("Manager's Name: "+ super.getName());
        System.out.println("Manager's Surname: "+ super.getSurname());
        System.out.println("Number of Employees: "+  getNumber_of_employees());
    }
}

