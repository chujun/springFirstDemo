package com.chujun.spring.demo.first.business;

/**
 * Created by Administrator on 2015/9/12 0012.
 */
public class SpELExpression {
    private double number;

    private boolean comparetor;

    private boolean textualComparetor;

    private boolean largeCircle;

    private boolean notExpression;

    private String conditionExpression;

    private boolean matchesExpression;

    public boolean getMatchesExpression() {
        return matchesExpression;
    }

    public void setMatchesExpression(boolean matchesExpression) {
        this.matchesExpression = matchesExpression;
    }

    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public boolean isNotExpression() {
        return notExpression;
    }

    public void setNotExpression(boolean notExpression) {
        this.notExpression = notExpression;
    }

    public boolean isLargeCircle() {
        return largeCircle;
    }

    public void setLargeCircle(boolean largeCircle) {
        this.largeCircle = largeCircle;
    }

    public boolean isTextualComparetor() {
        return textualComparetor;
    }

    public void setTextualComparetor(boolean textualComparetor) {
        this.textualComparetor = textualComparetor;
    }

    public boolean isComparetor() {
        return comparetor;
    }

    public void setComparetor(boolean comparetor) {
        this.comparetor = comparetor;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
