import org.hibernate.Session;

import javax.persistence.GeneratedValue;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Department aZona = Department.builder()
                .departmentName("A")
                .build();
        Department fresh = Department.builder()
                .departmentName("FRESH")
                .build();
        Department tabakas = Department.builder()
                .departmentName("Tabakas")
                .build();

        PickedRows petroRows = PickedRows.builder()
                .pickedRows(14000L)
                .pickedWeight(100000.34)
                .department(aZona)
                .build();

        Employee petras = Employee.builder()
                .employeeNo(1234L)
                .fullName("Petras Petraitis")
                .departments(List.of(aZona))
                .build();

        session.beginTransaction();
        session.persist(aZona);
        session.getTransaction().commit();

        session.beginTransaction();
        session.persist(fresh);
        session.getTransaction().commit();

        session.beginTransaction();
        session.persist(tabakas);
        session.getTransaction().commit();

        session.beginTransaction();
        session.persist(petroRows);
        session.getTransaction().commit();

        session.beginTransaction();
        session.persist(petras);
        session.getTransaction().commit();
    }
}
