package demo;

import entity.Instructor;
import entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

    public static void main(String[] args) {
        SessionFactory sessionFactory =  new Configuration()
                                            .configure("hibernate.cfg.xml")
                                            .addAnnotatedClass(Instructor.class)
                                            .addAnnotatedClass(InstructorDetail.class)
                                            .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {

            session.beginTransaction();


            int id =1;

            Instructor instructor = session.get(Instructor.class, id);

            System.out.println("Instructor found: "+ instructor);

            if(instructor!=null){
                System.out.println("Deleting...");

                //because of cascade.ALL, instructorDetail entry linked to this instructor will also be deleted
                session.delete(instructor);
            }


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
