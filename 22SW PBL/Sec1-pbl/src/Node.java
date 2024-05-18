public class Node {
    Node next;
    String gender;
    String group;
    int math_score;
    int reading_score;
    int writing_score;
    String parental_level; 
    String lunch;
    String Prep;
    int average_score;
    
    
    public Node(String gender, String group, String parental_level ,String lunch,
     String Prep, String math_score, String reading_score, String writing_score){
        this.gender=gender;
        this.group=group;
        this.math_score=Integer.parseInt(math_score);
        this.reading_score=Integer.parseInt(reading_score);
        this.writing_score=Integer.parseInt(writing_score);
        this.parental_level=parental_level;
        this.lunch=lunch;
        this.Prep=Prep;
        this.Average();
        next=null;
    }

    public Node(Node data){
        this(data.gender,data.group,data.parental_level,data.lunch,data.Prep,
        data.math_score,data.reading_score,data.writing_score);
    }

    public Node(Node n1,Node n2){
        this(n1);
        next=n2;

    }

    public Node(String gender, String group, String parental_level, String lunch,
         String prep, int math_score, int reading_score, int writing_score) {
                this.gender=gender;
                this.group=group;
                this.math_score=(math_score);
                this.reading_score=(reading_score);
                this.writing_score=(writing_score);
                this.parental_level=parental_level;
                this.lunch=lunch;
                this.Prep=prep;
                
                this.Average();
                next=null;
    }

    public void display(){
        System.out.println("Gender = "+this.gender+", Group = "+this.group
        +", Math Score = "+this.math_score+", Reading Score = "+this.reading_score
        +", Writing Score = "+this.writing_score+", Parental Level = "+this.parental_level
        +", Lunch = "+this.lunch+", Prep = "+this.Prep+", Average Score = "+this.average_score);
    }

    public void Average(){
        this.average_score=(this.math_score+this.reading_score+this.writing_score)/3;
    }
}
