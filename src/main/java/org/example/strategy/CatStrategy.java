package org.example.strategy;

public class CatStrategy implements Strategy{

  private final Sound sound = () -> System.out.println("Mew!");

  @Override
  public void exec(Animal animal) {
    System.out.println("Hi i'm a " + animal.whoAmI() + " and my sound is ");
    sound.sound();

  }
}
