# springBasics



1. Create a class Database with 2 instance variables port and name. Configure Database class bean in spring container through Spring XML. Initialize instance variables using setter method.

2. Get the bean of the class from spring container and print the values of the instance variable.

3. Create a class Restaurant. Create an interface HotDrink with an abstract method prepareHotDrink. Create two classes Tea and ExpressTea which implements HotDrink Class. Create an instance variable of type HotDrink in Restaurant class. Configure Tea and ExpressTea classes beans in Spring XML. create a bean with the name teaRestaurant of type Restaurant which inject Tea object as dependency using setter method.

4. Get both the beans and invoke prepareHotDrink method via hotDrink 
    instance variables. Try inner bean with expressTeaRestaurant.

5. Create Class Complex as follows: class complex {    List list;
        Set set;
         Map map;
         } Initialize all the instance variables of the complex class using Spring XML. Give bean name as
complexBean. Get the bean and display the properties.

6. Autowire hotDrink in Restaurant with tea bean byName, byType and constructor.

7. Set the scope of the teaRestaurant bean as proptotype and check the scope type after accessing the bean.

8. Use @Required annotation for hotDrink setter method in Restaurant class.

9. Use @Autowired annotation to wire Tea with Restaurant class Using setter method, field and constructor.

10. Use @Component, @Controller, @Repository etc annotation to configure Tea and Restaurant in Spring Container.



Questions 1 through 5 are answered in config.xml and classes Application.java, Database.java, Restaurant.java, HotDrink.java, Tea.java, ExpressTea.java and Complex.java.

Question 6 is demonstrated through config1.xml, Restaurant1.java and Application1.java.

Question 7 is demonstrated through the same files and classes as questions 1 to 5.

Question 8 is demonstrated through Restaurant.java.

Question 9 is demonstrated through config2.xml, Restaurant2.java and Application2.java.

Question 10 is demonstrated through classes in package ques10 and config.xml.
