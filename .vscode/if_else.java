public class if_else {
    public static void main(String[] args) {
        int age = 20;
        if(age >=18){
             System.out.println("you are adult");
        }else{
            System.err.println("you are minor");
        }
     

        // Switch case example
        int month = 1;
        switch(month) {
            case 1 -> System.err.println("January");
            case 2 -> System.err.println("February");
            case 3 -> System.err.println("March");
            default -> System.err.println("Invalid month");
        }
        }
    }

