package modells;

import java.util.Arrays;

import models.Athlete;

  public class club {
  private String name;
  private Athlete[] athletes;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Athlete[] getAthletes() {
    return athletes;
  }
  public void setAthletes(Athlete[] athletes) {
    this.athletes = athletes;
  }
  @Override
  public String toString() {
    return "club [name=" + name + ", athletes=" + Arrays.toString(athletes) + "]";
  }
  

  
}
