# **Concepts of Programming Assignment 3 Questions**

*-Class taught by Vaishali Chikhalkar*

1.  Create a  class Point2D, under package "com.cdac.geometry" for representing a point in x-y co-ordinate system.
    1. Create a parameterised constructor to accept x & y co-ordinates.
    2. Add public String show()) --to return point's x & y co-ordinates
    3. Add isEqual method to Point2D class : boolean returning method : must return true if both points are having same x & y co-ordinates or false otherwise.
    4. Add a method , calculateDistance , to calc distance between 2 points (Hint : use distance formula)
    5. Create a Driver class(for UI)  , in the "tester" package "TestPoints" , with main(..). Ask user , how many points to plot? Create suitable array.
    6. Accept x & y co-ordinates for all the points n store it suitably.
    7. Display x & y co-ordinates of all the points plotted so far ,using for-each loop.
    8. Accept 2 indices from user. Find out if the points at these indices are same or different (Hint : isEqual). Print the message accordingly. If points are not same , display distance between these 2 points.



2.  Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy. Use tight encapsulation.

      Properties (instance variables)  : colour : String , weight : double , name:String, fresh : boolean. 
      Add suitable constructor.
      Override  toString correctly to return state of all fruits (return only  : name ,colour , weight )
      Add a taste() method to return String form of the taste of the Fruit eg :  public String taste()

      For Fruit : Can you identify taste of any general fruit ?
      So  return :  "no specific taste"
      Apple : should return  "sweet n sour"
      Mango : should return  "sweet"
      Orange : should return  "sour"

      Add specific functionality , in the sub classes
      In Mango : public void pulp() {Display name n colour of the fruit + a message  creating  pulp!}
      In Orange : public void juice() {Display name n weight of the fruit + a message extracting juice!}
      In Apple : public void jam() {Display name of the fruit + a message  making jam!}

      Add all of above classes under the package "com.app.fruits"

      Create java application FruitBasket , with main method , as a tester. Prompt user for the basket size n create suitable data structure. Supply options
      1. Add Mango
      2. Add Orange
      3. Add Apple; NOTE : You will be adding a fresh fruit in the basket , in all of above options.
      4. Display names of all fruits in the basket.
      5. Display name, colour, weight , taste of all fresh fruits , in the basket.
      6. Mark a fruit in a basket , as stale(=not fresh) 
              i/p : index
              o/p : error message (in case of invalid index) or mark it stale
      7. Mark all sour fruits stale(Hint : Use equals() method of the String class.)
      8. Invoke fruit specific functionality (pulp / juice / jam)
              i/p : index (Invoke correct functionality (pulp / juice / jam))
      10. Exit



3. Solve this business Scenario. Fresh business scenario to apply inheritance , polymorphism n abstraction to Emp based organisation scenario. Create Emp based organization structure — Emp , Mgr , Worker.
All of above classes must be in --com.app.org

      1. Emp state--- id(int), firstName, lastName , deptId , basic(double).
      Emp id MUST be automatically generated.
      Behaviour ---
        1.  get Emp details -- using  toString.
        2. compute net salary

      2. Mgr state  ---id, name, basic, deptId , perfBonus
      Behaviour ----
        1. get mgr details :  using toString.
        2. compute net salary (formula: basic+perfBonus) -- override computeNetSalary
        3. get performance bonus. --add a new method to return bonus.(getter)

      3. Worker state  --id, name, basic, deptId, hoursWorked, hourlyRate
      Behaviour---
        1. get worker details -- :  override toString.
        2. compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
        3. getHourlyRate of the worker  -- add a new method to return hourly rate of a worker. (getter). 

      Organise classes in inheritance  hierarchy.

      NOTE : toString method SHOULD NOT include the net salary of the employee
      Write TestOrganisation in "tester" package. Create suitable array to store organization details. Provide following options

      1. Hire Manager
      i/p : manager details , except id

      2. Hire Worker
      i/p : worker details , except id

      3. Display information of all employees(toString) including net salary(computeNetSalary)  using single for-each loop.

      4. Update basic salary
      /p : Emp id , salary increment

      In case of invalid Emp id  , either : display error message directly OR (still better) throw custom exception n handle it in centralised manner (This can be added later!)

      10. Exit
      
   
   
4.  Solve the following:
      1. Create abstract class Shape --state :  x, y
          Abstract Method --public double area();
          public String toString() : to return x & y

          Why will area() be abstract in Shape class ?????????

      2. Circle -- x, y, radius
          Concrete overriding Method --public double area() : ret area of circle
          public String toString() : ret x, y & radius

      3. Rectangle -- x, y, w, h
          Concrete overriding Method --public double area() : ret area of rectangle
          public String toString() : ret x, y , width & height

      4. Square-- x, y, side
          Concrete overriding Method --public double area() : ret area of square
          public String toString() : ret x, y , side

      5. Create a ShapeFactory class
          Add a static method(generateShape)  to return randomly generated shape.
          Hint : random no generator

      6. Create a Tester . Invoke ShapeFactory's generateShape() method , in a for-loop (5 times) to display details & area of each shape



5.  Define an interface and implement it in any class wherever it is required.
    Pre-condition: 
    Employee, Date and Shape class should be created.

    Problem Statement:
    Define an interface Printable with a method print(). Implement this interface in Employee, Shape and Date class
