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
public class ObjectBubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ObjectBubbleSort ob = new ObjectBubbleSort();
        Student arr[] = {
            new Student("Bob", 4),
            new Student("Tama", 3),
            new Student("Bob", 1),
            new Student("Susan", 2),
            new Student("Sarah", 3),
            new Student("Abdul", 2),
            new Student("Jama", 3),
            new Student("Jen", 1),};
        System.out.println("The Unsorted array of students is");
        ob.printArray(arr);

        // apply sort
        ob.doBubbleSort(arr);
        System.out.println("The Basic Bubble Sorted by rating array is");
        ob.printArray(arr);
        
        
    }
    
    void doBubbleSort(Student arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getRating() > arr[j + 1].getRating()) { //sort by Rating
                //if (arr[j].getName().compareTo(arr[j + 1].getName()) > 0 ) { //sort by Name
                    // swap temp and arr[i]
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /* Prints the array */
    void printArray(Student arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i].getName() + " ");
        }
        System.out.println();
        System.out.println();
    }
    
}
