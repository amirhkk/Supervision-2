package uk.ac.cam.ahk44.oop.supo2;

public class Ex5{
  interface Ninja {
      public int getAge();
      public void setAge(int x);
      public int getSalary();
      public void setSalary(int x);
  }

  public static class Employee implements Ninja {
      String name;
      int Age;
      int Salary;
      public int getAge() {return this.Age;}
      public void setAge(int Age) {this.Age = Age;}
      public int getSalary() {return this.Salary;}
      public void setSalary(int s) {this.Salary = s;}
  }

  public static void main(String args[]) {
      Ninja p = new Employee();
      p.setAge(21);
      System.out.println(p.getAge());
  }
}
