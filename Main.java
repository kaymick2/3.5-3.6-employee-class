
class Main {
  public static void main(String[] args) {
    Employee MrsK = new Employee("Danelle K", 85000);
    Employee dBacon = new Employee("Don Bacon", 30000);
    Employee kMcDowell = new Employee("Kyle McDowell", 40000);
    Employee cdrumpf = new Employee("Donald Cheeto Drumpf", 20000);
    System.out.println(MrsK.getName() + " Makes $" + MrsK.getSalary() + " a year");
    System.out.println(dBacon.getName() + " Makes $" + dBacon.getSalary() + " a year");
    System.out.println(kMcDowell.getName() + " Makes $" + kMcDowell.getSalary() + " a year");
    System.out.println(cdrumpf.getName() + " Makes $" + cdrumpf.getSalary() + " a year");
    System.out.println("****************************************");
    System.out.println(
        "Everyone has been great on the job, so it looks like the boss was generous with the christmas bonuses this year! \nEveryone got a 10% raise!");
    System.out.println(MrsK.getName() + "'s pay has been increased to $" + MrsK.raise(10) + " a year.");
    System.out.println(dBacon.getName() + "' pay has been increased to $" + dBacon.raise(10) + " a year.");
    System.out.println(kMcDowell.getName() + "'s pay has been increased to $" + kMcDowell.raise(10) + " a year.");
    System.out.println(cdrumpf.getName() + "'s pay has been increased to $" + cdrumpf.raise(10) + " a year.");

  }
}