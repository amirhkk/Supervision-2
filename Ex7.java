package uk.ac.cam.ahk44.oop.supo2;

public class Ex7{
  public static class Person{
    String FirstName;
    String SecondName;

    private Person(String A, String B){
      this.FirstName = A;
      this.SecondName = B;
    }
  }
  public static void testOutput(){
    Person p = new Person("Joe", "Blogg");
    System.out.println("Person details: " + p);
  }

  public static void main(String args[]) {
      testOutput();
  }
}
