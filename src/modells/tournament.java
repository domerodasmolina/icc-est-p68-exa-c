package modells;

import java.util.Arrays;

import models.Athlete;
import models.Club;

  public class tournament {
  private String name;
  private Club[] clubs;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Club[] getClubs() {
    return clubs;
  }
  public void setClubs(Club[] clubs) {
    this.clubs = clubs;
  }
  @Override
  public String toString() {
    return "tournament [name=" + name + ", clubs=" + Arrays.toString(clubs) + "]";
  }
  public int getTotalStarterPoints(){
    int totalStarterPoints=0;
    for (Club club : clubs) {
      for (Athlete athelete : club.getAthletes()) {
        if (athelete.isStarter()) {
          totalStarterPoints+=athelete.getPoints();
        }
        
      }
      
    }
    return totalStarterPoints;

  }


}
