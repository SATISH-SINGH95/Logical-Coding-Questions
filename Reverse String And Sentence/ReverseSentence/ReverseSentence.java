package ReverseSentence;

public class ReverseSentence {

    public static void main(String[] args) {
        
        String sentence = "This is my pen";

        String[] s = sentence.split(" ");

        for(int i = s.length-1; i>=0; i--){
            System.out.print(s[i]+ " ");
        }
    }
    
}
