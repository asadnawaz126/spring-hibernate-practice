package demo;

import entitiy.Instructor;
import entitiy.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {

    public static void main(String[] args) {
        SessionFactory sessionFactory =  new Configuration()
                                            .configure("hibernate.cfg.xml")
                                            .addAnnotatedClass(Instructor.class)
                                            .addAnnotatedClass(InstructorDetail.class)
                                            .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {

            Instructor instructor = new Instructor("Fahad", "Saleem", "fahadbinsaleem@gmail.com");

            InstructorDetail instructorDetail = new InstructorDetail("youtube.com/fahadsaleem", "Fortnite");

            instructor.setInstructorDetail(instructorDetail);


            session.beginTransaction();

            //will save instructordetail as well because of cascade.ALL property
            System.out.println("Saving instructor: "+ instructor);
            session.save(instructor);


            session.getTransaction().commit();

            System.out.println("Done!");


        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sessionFactory.close();
        }

    }
}
