package uk.ac.cam.ahk44.oop.supo2.Ex1;

public class classExample{
    public static class Student{
      int Age;
      String Name;
      int Grade;

      void SetAge(int x){
        this.Age = x;
      }
      void makeolder(){
        Age = Age + 1;
      }
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.SetAge(18);
        s.makeolder();
    }
}
