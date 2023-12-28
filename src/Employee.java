import java.util.LinkedList;
import java.util.List;

public  class Employee implements Comparable<Employee> {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public  int compareTo(Employee o) {
//         return Integer.compare(this.getAge(), o.getAge());  //  по возрастанию возроста
//         return Double.compare(this.getSalary(), o.getSalary()); // по возрастанию зарплаты
//        if (o.age > this.age) {
//            return 1;
//        }
//        else if (o.age == this.age){ // по убыванию возраста
//            return 0;
//        }
//        else
//            return -1;

        if (o.salary > this.salary) {
            return 1;
        }
        else if (o.salary == this.salary) {
            return 0;
        }
        else
            return -1;
        
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
