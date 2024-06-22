package com.intertech.quiz;

/**
 * Created by emiryalgin on 2019-07-03.
 */
public class Question {
    private String image;
    private String answer;
    private boolean answered;

    public Question(String image, String answer, boolean answered) {
        this.image = image;
        this.answer = answer;
        this.answered = answered;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }
}
