/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;

public class QuestionCode implements Serializable {
private String questionText1;
private String questionText2;
private String questionText3;
private String questionText4;
private String questionText5;
private String answer1;
private String answer2;
private String answer3;
private String answer4;
private String answer5;
private String chemquestionText1;
private String chemquestionText2;
private String chemquestionText3;
private String chemquestionText4;
private String chemquestionText5;
private String chemAnswer1;
private String chemAnswer2;
private String chemAnswer3;
private String chemAnswer4;
private String chemAnswer5;
private String phyquestion1;
private String phyquestion2;
private String phyquestion3;
private String phyanswer1;
private String phyanswer2;
private String phyanswer3;




public QuestionCode(){
    questionText1 = new String();
    questionText2 = new String();
    questionText3 = new String();
    questionText4 = new String();
    questionText5 = new String();
    chemquestionText1 = new String();
    chemquestionText2 = new String();
    chemquestionText3 = new String();
    chemquestionText4 = new String();
    chemquestionText5 = new String();
    chemAnswer1 = new String();
    chemAnswer2 = new String();
    chemAnswer3 = new String();
    chemAnswer4 = new String();
    chemAnswer5 = new String();
    answer1 = new String();
    answer2 = new String();
    answer3 = new String();
    answer4 = new String();
    answer5 = new String();
  
    phyquestion1 = new String();
    phyquestion2 = new String();
    phyquestion3 = new String();
    phyanswer1 = new String();
    phyanswer2 = new String();
    phyanswer3 = new String();
    
   
    }


    public String getQuestionText1() {
        return questionText1;
    }

    public void setQuestionText1(String questionText1) {
        this.questionText1 = questionText1;
    }

    public String getQuestionText2() {
        return questionText2;
    }
    public void setQuestionText2(String questionText2) {
        this.questionText2 = questionText2;
    }
    public String getQuestionText3() {
        return questionText3;
    }
    public void setQuestionText3(String questionText3) {
        this.questionText3 = questionText3;
    }
    public String getQuestionText4() {
        return questionText4;
    }
    public void setQuestionText4(String questionText4) {
        this.questionText4 = questionText4;
    }
    public String getQuestionText5() {
        return questionText5;
    }
    public void setQuestionText5(String questionText5) {
        this.questionText5 = questionText5;
    }
    
    
    
    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
        
    }
    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
        
    }
    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
        
    }
    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
        
    }
    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
        
    }
    ////////////////////////////////////////////////////
    public String getchemquestionText1(){
        return chemquestionText1;
    }
    public void setChemquestionText1(String chemquestionText1) {
        this.chemquestionText1 = chemquestionText1;
    }
        
    public String getchemquestionText2(){
        return chemquestionText2;
    }
    public void setchemquestionText2(String chemquestionText2) {
        this.chemquestionText2 = chemquestionText2;
    }
    public String getchemquestionText3(){
        return chemquestionText3;
    }
    public void setchemquestionText3(String chemquestionText3) {
        this.chemquestionText3 = chemquestionText3;
    }
    public String getchemquestionText4(){
        return chemquestionText4;
    }
    public void setchemquestionText4(String chemquestionText4) {
        this.chemquestionText4 = chemquestionText4;
    }
    public String getchemquestionText5(){
        return chemquestionText5;
    }
    public void setchemquestionText5(String chemquestionText5) {
        this.chemquestionText5 = chemquestionText5;
    }
    
    
    public String getchemAnswer1() {
        return chemAnswer1;
    }

    public void setchemAnswer1(String chemAnswer1) {
        this.chemAnswer1 = chemAnswer1;
        
    }
    public String getchemAnswer2() {
        return chemAnswer2;
    }

    public void setchemAnswer2(String chemAnswer2) {
        this.chemAnswer2 = chemAnswer2;
        
    }
    public String getchemAnswer3() {
        return chemAnswer3;
    }

    public void setchemAnswer3(String chemAnswer3) {
        this.chemAnswer3 = chemAnswer3;
        
    }
    public String getchemAnswer4() {
        return chemAnswer4;
    }

    public void setchemAnswer4(String chemAnswer4) {
        this.chemAnswer4 = chemAnswer4;
        
    }
    public String getchemAnswer5() {
        return chemAnswer5;
    }

    public void setchemAnswer5(String chemAnswer5) {
        this.chemAnswer5 = chemAnswer5;
        
    }
    ////////////////////
    
    public String getphyquestion1(){
        return phyquestion1;
    }
    public String getphyquestion2(){
        return phyquestion2;
    }
    public String getphyquestion3(){
        return phyquestion3;
    }
    public void setphyquestion1(String phyquestion1){
        this.phyquestion1 = phyquestion1;
    }
     public void setphyquestion2(String phyquestion2){
        this.phyquestion2 = phyquestion2;
    }
      public void setphyquestion3(String phyquestion3){
        this.phyquestion3 = phyquestion3;
    }
    
    public String getphyanswer1(){
        return phyanswer1;
    }
     public String getphyanswer2(){
        return phyanswer2;
    }
     public String getphyanswer3(){
        return phyanswer3;
    }
      public void setphyanswer1(String phyanswer1){
        this.phyanswer1 = phyanswer1;
    }
       public void setphyanswer2(String phyanswer2){
        this.phyanswer2 = phyanswer2;
    }
        public void setphyanswer3(String phyanswer3){
        this.phyanswer3 = phyanswer3;
    }
    
    
    
    
    
    
    
    
  
    
}
