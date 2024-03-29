package com.hib;
// Generated Jun 28, 2017 1:40:49 PM by Hibernate Tools 4.3.1



import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Questionbank generated by hbm2java
 */
@Entity(name="questionBank")
@Table(name="QuestionBank")
public class Questionbank  implements java.io.Serializable {

     @Id// @Column(name = "questid") 
     private int questid;
     @Column(name="question")
     private String question;
     @OneToMany( mappedBy = "questionBank" )
     private Set answerses = new HashSet(0);

    public Questionbank() {
    }

	
    public Questionbank(int questid) {
        this.questid = questid;
    }
    public Questionbank(int questid, String question, Set answerses) {
       this.questid = questid;
       this.question = question;
       this.answerses = answerses;
    }
   
    public int getQuestid() {
        return this.questid;
    }
    
    public void setQuestid(int questid) {
        this.questid = questid;
    }
    public String getQuestion() {
        return this.question;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }
    public Set getAnswerses() {
        return this.answerses;
    }
    
    public void setAnswerses(Set answerses) {
        this.answerses = answerses;
    }




}


