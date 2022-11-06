package org.example.strategy;

public class DogStrategy implements Strategy{


  @Override
  public void exec(Animal animal) {
    System.out.println("Hi i'm a " + animal.whoAmI());
  }
}
