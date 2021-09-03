import Abstract.AbDataBase;
import Abstract.AbItem;
import Abstract.AbMaterial;
import Generic.GenericClass;
import Generic.GenericMethod;
import Interfaces.IDataBase;
import Interfaces.Item;
import Interfaces.Material;
import Models.Employee;
import Models.Manager;

import java.util.*;

public class Main{
    public static void main(String[] args) {

        // Inheritance - Polymorphism
        Employee employee1 = new Employee("a","b");
        employee1.setName("Employee");
        employee1.setSurname("Surname");
        Manager manager1 = new Manager("b","c",4);
        manager1.setName("Faruk");
        manager1.setSurname("Yilmaz");
        manager1.setNumber_of_employess(5);

        employee1.showinfos();
        manager1.showinfos();

        Employee employee2 = new Employee();
        employee2.showinfos();

        IDataBase item1 = new Item();
        IDataBase material1 = new Material();
        item1.add();
        material1.add();

        AbDataBase abItem1 = new AbItem();
        AbDataBase abMaterial = new AbMaterial();

        abItem1.add();
        abItem1.delete();
        abMaterial.add();
        abMaterial.delete();

        // Collection Frameworks
        Employee employee = new Employee();
        ArrayList<String> a = new ArrayList();
        a.add("a");
        a.add(0,"c");
        a.forEach(item -> System.out.println(item));

        ArrayList b = new ArrayList();
        b.add(employee);
        b.add(2);
        b.add("string");
        b.forEach(item -> System.out.println(item));

        ArrayList <Employee> e = new ArrayList<Employee>();
        e.add(employee);
        e.forEach(item -> item.showinfos());


        TreeSet t = new TreeSet();
        t.add("b");
        t.add("a");

        t.forEach(item -> System.out.println(item));

        HashSet h = new HashSet();
        h.add(5);
        h.add("str");
        h.add(1.1);
        h.add(true);
        h.forEach(item ->  System.out.println(item));

        // Generic
        GenericClass<Integer,String,Double> genericClass = new GenericClass<>(1,"a",1.1);
        GenericClass<String,String,String> genericClassString = new GenericClass<>("a","b","c");
        genericClass.showinfos();
        genericClassString.showinfos();

        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"a","b","c"};

        GenericMethod.genericMethod(intArray);
        GenericMethod.genericMethod(strArray);
    }
}
