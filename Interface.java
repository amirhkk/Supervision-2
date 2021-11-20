package uk.ac.cam.ahk44.oop.supo2.Ex1;
public class Interface{
  interface Pet {
      public void test();
  }

  public static class Dog implements Pet {
      public void test() {
          System.out.println("Interface Method Implemented");
      }
  }

  public static void main(String args[]) {
      Pet p = new Dog();
      p.test();
  }
}
