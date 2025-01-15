package entities;

public class Student {
    public static String name;
    public static double score1;
    public static double score2;
    public static double score3;

    public  String finalScore(){
        double finalScore = this.score1 + this.score2 + this.score3;
        double difference = 60 - finalScore;
        if(finalScore < 60){
            return "You fail! you need to get: " + String.format("%.2f",difference) + " extra points to pass";
        }
        if(finalScore > 60){
            return "You pass! your score is: " + String.format("%.2f",finalScore);
        }
    return null;
    }

}
