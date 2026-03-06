class Demo {

    int id;

    Demo(int i) {
        id = i;
    }

    protected void finalize() {
        System.out.println("Object with id " + id + " is destroyed");
    }
}

public class TestFinalize {

    public static void main(String[] args) {

        Demo d1 = new Demo(1);
        Demo d2 = new Demo(2);

        d1 = null;
        d2 = null;

        System.gc();   // request garbage collector

        System.out.println("End of program");
    }
}