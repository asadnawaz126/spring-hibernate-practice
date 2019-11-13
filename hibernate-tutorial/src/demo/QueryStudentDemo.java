package demo;

import entitiy.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {

    public static void main(String[] args) {
        SessionFactory sessionFactory =  new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {

            //Querying students in database

            session.beginTransaction();

            List<Student> students = session.createQuery("from Student").getResultList();

            displayStudents(students);

            students = session.createQuery("from Student s where s.firstName = 'Nawaz'").getResultList();

            displayStudents(students);


            session.getTransaction().commit();

            System.out.println("Read all entries done");





        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sessionFactory.close();
        }

    }

    private static void displayStudents(List<Student> students) {
        for(Student student : students){
            System.out.println(student);
        }
    }
}
