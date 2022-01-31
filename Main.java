public class Main {

    public static class Cat {

        String name;
        int age;

        // конструктор класса Cat
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public static void main(String[] args) {

            Cat barsik = new Cat( name: "Barsik", age: 5);
            Cat tom = new Cat( name: "Tom", age: 10);
            System.out.println(barsik.name + " " + barsik.age);
            System.out.println(tom.name + " " + tom.age);
        }
    }
}

