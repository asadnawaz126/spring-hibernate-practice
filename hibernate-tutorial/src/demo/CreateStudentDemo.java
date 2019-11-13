package demo;

import entitiy.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args) {
        SessionFactory sessionFactory =  new Configuration()
                                            .configure("hibernate.cfg.xml")
                                            .addAnnotatedClass(Student.class)
                                            .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {

            System.out.println("Creating student object...");
            Student tempStudent = new Student("Asad","Nawaz", "asadnawaz@gmail.com");
            Student tempStudent2 = new Student("Fahad","Nawaz", "fahadnawaz@gmail.com");

            session.beginTransaction();

            System.out.println("Saving student...");

            session.save(tempStudent);
            session.save(tempStudent2);


            session.getTransaction().commit();

            System.out.println("Object saved");


        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sessionFactory.close();
        }

    }
}
