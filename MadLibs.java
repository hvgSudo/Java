
package madlibs;

/**
 *
 * @author harsh
 */
import java.util.Scanner;
import java.util.Random;
public class MadLibs {
    
    Scanner sc = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();
    
    //Getters
    
    public String getStory() {
        return story;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAdjective1() {
        return adjective1;
    }
    
    public String getAdjective2() {
        return adjective2;
    }
    
    public String getNoun1() {
        return noun1;
    }
    
    public String getNoun2() {
        return noun2;
    }
    
    public String getNoun3() {
        return noun3;
    }
    
    public String getAdverb() {
        return adverb;
    }
    
    public String getRandomNums() {
        return randomNums;
    }
    
    //Setters
    
    public void setStory(String newStory) {
        this.story = newStory;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setAdjective1(String newAdj1) {
        this.adjective1 = newAdj1;
    }
    
    public void setAdjective2(String newAdj2) {
        this.adjective2 = newAdj2;
    }
    
    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }
    
    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }
    
    public void setNoun3(String newNoun3) {
        this.noun3 = newNoun3;
    }
    
    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }
    
    public void setRandomnums() {
        
    }
    
    public void printTnstructions() {
        System.out.println("Welcom to the MadLibs game. \nIf you type in " + 
                "words, we'll give you a story. \nStart by typing a name");
    }
    
    public void putTogetherTheStroy() {
        
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
