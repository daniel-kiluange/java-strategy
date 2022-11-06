package org.example;

import org.example.strategy.Animal;
import org.example.strategy.Cat;
import org.example.strategy.CatStrategy;
import org.example.strategy.Dog;
import org.example.strategy.DogStrategy;
import org.example.strategy.Strategy;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Cat cat = new Cat();
    Dog dog = new Dog();

    client(cat);

    client(dog);
  }

  public static void client(Animal animal){
    Strategy strategy = switch (animal.whoAmI()){
      case "dog": yield new DogStrategy();
      case "cat": yield new CatStrategy();
      default: throw new RuntimeException();
    };
    strategy.exec(animal);
  }
}