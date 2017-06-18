
package com.einsite.utility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
 
public class HibernateUtility
{
   private static SessionFactory sessionFactory = buildSessionFactory();
 
   private static SessionFactory buildSessionFactory()
   {
      try
      {
         if (sessionFactory == null)
         {
            try {
				Configuration configuration = new Configuration().configure(HibernateUtility.class.getResource("/com/einsite/hibernate.cfg.xml"));
				StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
				serviceRegistryBuilder.applySettings(configuration.getProperties());
				ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            /*Configuration configuration = new Configuration().configure();
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
            applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());*/
         }
         return sessionFactory;
      } catch (Throwable ex)
      {
         System.err.println("Initial SessionFactory creation failed." + ex);
         throw new ExceptionInInitializerError(ex);
      }
   }
 
   public static SessionFactory getSessionFactory()
   {
      return sessionFactory;
   }
 
   public static void shutdown()
   {
      getSessionFactory().close();
   }
}
