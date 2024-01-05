package fr.cda.demo.fizzbuzz;


public class FizzBuzz {

    /**
     * Retourne Fizz si multiple de 3,
     * Buzz si multiple de 5
     * FizzBuzz si multiple de 3 et de 5
     * @param number Nombre à vérifier
     * @return Fizz, Buzz ou FizzBuzz
     */
    public String say(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
