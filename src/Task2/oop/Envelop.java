package Task2.oop;

class Envelop {

    /* variables are initialized with default values for default constructor */
    private double width = 10;
    private double height = 20;

    Envelop() {

    }

    Envelop(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public static void compare(Envelop envelop, Envelop envelop1) {
        if ((Double.compare(envelop.width, envelop1.width) == -1) &&
                (Double.compare(envelop.height, envelop1.height) == -1)) {
            System.out.println("Envelop 1 can fit inside of envelop 2");
        } else if ((Double.compare(envelop1.width, envelop.width) == -1) &&
                Double.compare(envelop1.height, envelop.height) == -1) {
            System.out.println("Envelop 2 can fit inside of envelop 1");
        } else {
            System.out.println("Envelops do not fit into each other");
        }
    }

    public static void main(String[] args) {
        Envelop env1 = new Envelop(10.0, 13.0);
        Envelop env2 = new Envelop(11.0, 12.0);
        compare(env1, env2);

        env1 = new Envelop(10.0, 11.0);
        env2 = new Envelop(10.0, 11.0);
        compare(env1, env2);

        env1 = new Envelop(9.0, 10.0);
        env2 = new Envelop(10.0, 11.0);
        compare(env1, env2);

        env1 = new Envelop(10.0, 11.0);
        env2 = new Envelop(9.0, 10.0);
        compare(env1, env2);

    }
}
