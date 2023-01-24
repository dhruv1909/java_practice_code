package org.practice;


class StaticBlock {
    public static void main(String[] args) {
        System.out.println("you are using windows");
    }

    static {
        String os = System.getenv("OS");
        if (!os.equals("Windows")) {
            System.out.println("static method runs");
            System.exit(1);

        }
    }
}
