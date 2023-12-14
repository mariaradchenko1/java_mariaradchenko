    static class Animal {
        private String name;
        private int age;
        private String color;

        public Animal(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }

        public void makeSound() {
            System.out.println("Тварина видає звук.");
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getColor() {
            return color;
        }
    }

    class Cat extends Animal {
        private String breed;

        public Cat(String name, int age, String color, String breed) {
            super(name, age, color);
            this.breed = breed;
        }

        @Override
        public void makeSound() {
            System.out.println("Мяу! Мяу!");
        }

        public String getBreed() {
            return breed;
        }
    }

    public class hw1 {
        public void main(String[] args) {

            Animal genericAnimal = new Animal("Тварина", 3, "Білий");
            System.out.println("Ім'я тварини: " + genericAnimal.getName());
            System.out.println("Вік тварини: " + genericAnimal.getAge());
            System.out.println("Колір тварини: " + genericAnimal.getColor());
            genericAnimal.makeSound();

            System.out.println();

            Cat myCat = new Cat("Мурзик", 2, "Сірий", "Персидська");
            System.out.println("Ім'я кота: " + myCat.getName());
            System.out.println("Вік кота: " + myCat.getAge());
            System.out.println("Колір кота: " + myCat.getColor());
            System.out.println("Порода кота: " + myCat.getBreed());
            myCat.makeSound();
        }
    }

}
