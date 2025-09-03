public class variable {

    int no = 100; // instance variable
    void m1()
    {
        int no1 = 10; // local variable
        System.out.println(no1 + no);
    }
    void m2() 
    {
        int no2 = 20; // local variable
        System.out.println(no2 + no);
    }
    public static void main(String[] args) {
        variable obj = new variable();
        obj.m1();
        obj.m2();
    }
}
