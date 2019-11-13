package demo;

import entitiy.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory =  new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {

            //CREATING STUDENT
            System.out.println("Creating student object...");

            Student tempStudent = new Student("Huma","Nawaz", "humanawaz@gmail.com");

            session.beginTransaction();

            System.out.println("Saving student...");
            System.out.println(tempStudent);
            session.save(tempStudent);


            session.getTransaction().commit();

            System.out.println("Object saved");



            //READING STUDENT
            System.out.println("ID of Student is: "+ tempStudent.getId());

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Getting student with id: "+ tempStudent.getId());

            Student retrievedStudent = session.get(Student.class, tempStudent.getId());

            System.out.println("Retrieval completed: "+ retrievedStudent);

            session.getTransaction().commit();

            System.out.println("Done");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sessionFactory.close();
        }

    }
}
