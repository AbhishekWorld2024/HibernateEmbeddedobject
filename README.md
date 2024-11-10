# HibernateEmbeddedobject
**Overview**<br>
This project demonstrates the use of Hibernate's @Embeddable annotation to create reusable, embedded objects within an entity. Using Hibernate ORM with MySQL, it provides an example of mapping complex data structures, showing how to embed multiple fields (such as NameInfo and AddressInfo) into a primary StudentInfo entity.<br><br>
**Project Structure**<br>
The project contains the following classes:<br>

StudentInfo: The main entity with fields for ID, name, and address.<br>
NameInfo: An embedded class to store the student's first and last names.<br>
AddressInfo: Another embedded class to store address details, including zip code, city, and country.<br><br>
**Hibernate Configuration**<br>
The Hibernate configuration (hibernate.cfg.xml) connects to a MySQL database and includes the following settings:<br>

Driver: com.mysql.jdbc.Driver<br>
URL: jdbc:mysql://localhost:3306/crudrepo<br>
Dialect: org.hibernate.dialect.MySQLDialect<br>
Username: root<br>
Password: <your_password><br>
Auto Schema Generation: hbm2ddl.auto set to create, ensuring the schema is generated upon startup.<br><br>
**Running the Project**<br>
To run this project, ensure you have:<br>

MySQL running with a database named crudrepo.<br>
Update the Hibernate configuration file (hibernate.cfg.xml) with your MySQL credentials.<br>
Compile and run the App class, which:<br>

Creates an instance of StudentInfo, setting embedded details for both name and address.<br>
Saves the StudentInfo object to the database.<br><br>
**Example Usage**<br>
The App class demonstrates creating and saving a StudentInfo object, which encapsulates both NameInfo and AddressInfo. This showcases the benefits of modular, embedded data structures for maintaining organized and reusable code.<br>

