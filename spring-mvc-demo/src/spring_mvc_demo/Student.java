package spring_mvc_demo;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;

    private LinkedHashMap<String, String> languageOptions;
    private LinkedHashMap<String, String> countryOptions;

    public Student(){

        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("PK", "Pakistan");
        countryOptions.put("USA", "United States of America");
        countryOptions.put("CAN", "Canada");
        countryOptions.put("RUS", "Russia");
        countryOptions.put("AUS", "Australia");


        languageOptions = new LinkedHashMap<>();
        languageOptions.put("Java", "Java");
        languageOptions.put("Python", "Python");
        languageOptions.put("Cpp", "C++");
        languageOptions.put("Kotlin", "Kotlin");

    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }


    public LinkedHashMap<String, String> getLanguageOptions() {
        return languageOptions;
    }

}
