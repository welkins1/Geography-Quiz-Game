//source package for program
package geographyquizgame;


//This class stores the question and answer pairs
class QuestionAnswerPair {
    
    //Question variable holds the question, answer variable holds the answer 
    private String question;
    private String answer;
    
    
    //This creates a question and answer pair 
    public QuestionAnswerPair(String question, String answer) {
        
        //Using "this" makes it so the program specifically knows which variable/object to refer to,
        this.question = question;
        this.answer = answer;
    }
    
    //Method to get the question
    public String getQuestion () {
        return question;
    }
    
    //Method to get the answer 
    public String getAnswer () {
        return answer;
    }
}
