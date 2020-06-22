/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectbubblesort;

/**
 *
 * @author 92020362
 */
public class Student {
    private String name;
    private int rating;

    // getter methods
    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public Student(String newName, int newRating) {
        name = newName;
        rating = newRating;
    } 
}
