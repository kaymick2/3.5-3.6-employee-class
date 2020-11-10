/**
 * @author = kymcbigmouth
 * @version 1.0
 * 
 *          this class contains inner workings of employee salaries, as well as
 *          a way to raise them.
 */
public class Employee {

  // private instance variables
  private String name;
  private double salary;

  /**
   * constructor for the employee class.
   * 
   * @params String employee, double amount are provided as default, but as long as what's inside the constructor matches, this could be anything.
   */
  public Employee(String name , double salary) {
    this.name = name;
    this.salary = salary;
  }

  // 3 methods as described in assignment
  /**
   * getName- Used with a print command to return full name of employee instead of
   * alias (how employees are called in the code)
   * 
   * @return name Returns full employee name
   */
  public String getName() {
    return name;
  }

  /**
   * getSalary - use with print command to return salary of an employee
   * 
   * @return salary Returns the salary of an employee rounded to one or more
   *         decimal places.
   */
  public double getSalary() {
    return salary;
  }

  /**
   * raise gives an employee a raise. \
   * 
   * use- call with employee alias as an implicit parameter.
   * 
   * @return salary Returns new salary after raise
   */
  public double raise(double newSalary) {
    salary = salary * (1 + (0.01 * newSalary));
    return salary;
  }
  // add javaDoc comments when done

}