public class Udemy_course_basics {
    public static void main (String[] args) {
        String name = "Taisha";
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition(name, position);
        
        position = calculateHighScorePosition(900);
        displayHighScorePosition(name, position);
        
        position = calculateHighScorePosition(400);
        displayHighScorePosition(name, position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition(name, position);
    }

    public static void displayHighScorePosition(String name, 
        int position) {
            System.out.println(name +" managed to get into "+
                "position "+ position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2; 
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}