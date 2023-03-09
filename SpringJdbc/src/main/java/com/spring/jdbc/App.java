package com.spring.jdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "MY PROGRAM STARTED......" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/Config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        /* INSERTING VALUE TO DATABASE - 1  
        Student student = new Student();
        student.setId(638);
        student.setName("Rinki");
        student.setCity("London");
        int result = studentDao.insert(student);
        System.out.println("student added " +result);  */
        
        
        /* UPDATING VALUE TO DATABASE - 2
        Student student = new Student();
        student.setId(638);
        student.setName("pinki");
        student.setCity("Nigeria");
        int result = studentDao.change(student);
        System.out.println("student data updated " +result);  */
        
        // DELETE VALUE TO DATABASE - 3
        int result = studentDao.delete(668);
        System.out.println("student data deleted " +result);
        
        
        
        
        
        
       /* I USED THIS TO GET DATA FROM XML MY FIRST APPROCH
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        
        // INSERT QUERY.....
        String query = "insert into student(id,name,city) values(?,?,?)";
        
        // FIRE QUERY......
        int result = template.update(query, 199, "Srishti", "Budaun");
        System.out.println("Number of recods Inserted" + result);
        */
    }
}
