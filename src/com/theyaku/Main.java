package com.theyaku;

public class Main {

    public static void main(String[] args) {
//	Person person = new Person("sam", 23, "Jakarta Selatan", true);
//
//	person.setAge(23);
//	person.setName("Sam");
//	person.setAddress("Jakarta Selatan");
//	person.setProgrammer(true);

//	person.getAddress();
//	System.out.println(person.getAge());
//	person.isProgrammer();

//	Player player = new Player("sam", 200.0, 5);
//
//	System.out.println(player.getHealth());

//     Dog dog = new Dog("Hachi", 20, " jungle", 2, 2, 1);
//
//     dog.getDogDescription();

//        LivingRoom livingRoom = new LivingRoom(3, 2, 1);
//        Kitchen kitchen = new Kitchen(1, 5, 10);
//        Yard yard = new Yard(true, false, 5);
//
//        House house = new House(livingRoom, kitchen, yard);
//
//        house.getYard().stuffOnYard();

        for(int i=1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 4) + 1;

        System.out.println("Random number was " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Avanger();
            case 2:
                return new KnifeOut();
            case 3:
                return new Parasite();
            case 4:
                return new Onward();
        }

        return null;

    }
}
