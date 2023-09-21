public class Main {
    public static void main(String[] args) {
        Class c = new Class(345,"dfgh",new int[3]);
        c.massive[0] =9;
        c.massive[1] =8;
        c.massive[2] =7;
        System.out.println(c);
    }
}