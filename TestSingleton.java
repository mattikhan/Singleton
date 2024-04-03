
package testsingleton;


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