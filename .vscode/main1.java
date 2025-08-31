interface Animal {
    void sound(); // public abstract by default
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow...");
    }
}

class main1 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}
