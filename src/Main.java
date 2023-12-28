import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Employee> list = new LinkedList<>();
        list.add(new Employee("Олег", 25, 100000));
        list.add(new Employee("Иван", 32, 200000));
        list.add(new Employee("Андрей", 30, 50000));
        list.add(new Employee("Александр", 45, 60000));
        list.add(new Employee("Илья", 28, 100000));
        list.add(new Employee("Валера", 25, 100000));
        list.add(new Employee("Ольга", 38, 50000));
        list.add(new Employee("Владимир", 25, 100000));
        list.add(new Employee("Артем", 46, 100000));
        list.add(new Employee("Дмитрий", 25, 800000));

        for (int i = 0; i < 5; i++) {
            Collections.sort(list);
            System.out.println(list.get(i));
//            System.out.println("Сортировка по возросту" + list);


        }
    }
}

