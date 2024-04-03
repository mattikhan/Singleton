/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsingleton;

/**
 *
 * @author sp21-bse-030
 */
public class TestSingleton {

    public static void testSingleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("Both instances are the same");
        } else {
            System.out.println("Instances are not the same");
        }
    }

    public static void main(String[] args) {
        testSingleton();
    }
}