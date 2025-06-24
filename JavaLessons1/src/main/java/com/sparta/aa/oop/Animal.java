package com.sparta.aa.oop;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Animal implements Eatable{

      public abstract String Speak();

      private String petname;
      private LocalDate birthdate;

      public Animal (String petname, int year, int month, int day)
      {        this.petname = petname;
          this.birthdate = LocalDate.of(year, month, day);
      }

      public String getPetname(){
          return petname;
      }

      public void setPetname(String newName){
          this.petname=newName;
      }

      public int getAge(){
          int ageOfPet = LocalDate.now().getYear() - birthdate.getYear();
          return ageOfPet;
      }

    @Override
    public String toString() {
        return getPetname() + " is " + getAge() + " years old";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(petname, animal.petname) && Objects.equals(birthdate, animal.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petname, birthdate);
    }
}

