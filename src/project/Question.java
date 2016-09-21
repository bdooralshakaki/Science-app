package project;
/*
*Shannon Mitchell
*Java Project
*Section: Expeiments
*/
public class Question {
    private String questionText;
    private String answer;
    private int mark;
    
    public Question(){
        questionText = new String();
        answer = new String();
        mark = 0;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    }
    
    
    
