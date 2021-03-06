package com.chujun.spring.demo.first.business;

import com.chujun.spring.demo.first.domain.City;

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

    private City chosenCity;

    private City chosenCityFromMap;

    private String pathFromProperties;

    private String dbNameFromPropertiesFile;

    private String javaHome;

    private String userDir;

    private char theChar;

    private City[] bigCities;

    private City firstBigCity;

    private City lastBigCity;

    private String[] cityNames;

    private String[] cityAndStateNames;

    private String[] bigCityAndStateNames;

    public String[] getBigCityAndStateNames() {
        return bigCityAndStateNames;
    }

    public void setBigCityAndStateNames(String[] bigCityAndStateNames) {
        this.bigCityAndStateNames = bigCityAndStateNames;
    }

    public String[] getCityAndStateNames() {
        return cityAndStateNames;
    }

    public void setCityAndStateNames(String[] cityAndStateNames) {
        this.cityAndStateNames = cityAndStateNames;
    }

    public String[] getCityNames() {
        return cityNames;
    }

    public void setCityNames(String[] cityNames) {
        this.cityNames = cityNames;
    }

    public City getFirstBigCity() {
        return firstBigCity;
    }

    public void setFirstBigCity(City firstBigCity) {
        this.firstBigCity = firstBigCity;
    }

    public City getLastBigCity() {
        return lastBigCity;
    }

    public void setLastBigCity(City lastBigCity) {
        this.lastBigCity = lastBigCity;
    }

    public City[] getBigCities() {
        return bigCities;
    }

    public void setBigCities(City[] bigCities) {
        this.bigCities = bigCities;
    }

    public char getTheChar() {
        return theChar;
    }

    public void setTheChar(char theChar) {
        this.theChar = theChar;
    }

    public String getUserDir() {
        return userDir;
    }

    public void setUserDir(String userDir) {
        this.userDir = userDir;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public void setJavaHome(String javaHome) {
        this.javaHome = javaHome;
    }

    public String getDbNameFromPropertiesFile() {
        return dbNameFromPropertiesFile;
    }

    public void setDbNameFromPropertiesFile(String dbNameFromPropertiesFile) {
        this.dbNameFromPropertiesFile = dbNameFromPropertiesFile;
    }

    public String getPathFromProperties() {
        return pathFromProperties;
    }

    public void setPathFromProperties(String pathFromProperties) {
        this.pathFromProperties = pathFromProperties;
    }

    public City getChosenCityFromMap() {
        return chosenCityFromMap;
    }

    public void setChosenCityFromMap(City chosenCityFromMap) {
        this.chosenCityFromMap = chosenCityFromMap;
    }

    public boolean isMatchesExpression() {
        return matchesExpression;
    }

    public City getChosenCity() {
        return chosenCity;
    }

    public void setChosenCity(City chosenCity) {
        this.chosenCity = chosenCity;
    }

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
