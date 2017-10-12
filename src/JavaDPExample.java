/**
 * Lab 3: Inheritance, Interfaces, Hash, Design Pattern and Big Number <br />
 * The {@code Animal} interface
 */
interface Animal {
    /**
     * An animal speaks
     */
    public void speak();
}

/**
 * Lab 3: Inheritance, Interfaces, Hash, Design Pattern and Big Number <br />
 * The {@code Lion} class
 */
class Lion implements Animal {
    /**
     * The lion speaks
     */
    public void speak() {
        System.out.println("ROAR");
    }
}

/**
 * Lab 3: Inheritance, Interfaces, Hash, Design Pattern and Big Number <br />
 * The {@code Mouse} class
 */
class Mouse implements Animal {
    /**
     * The mouse speaks
     */
    public void speak() {
        System.out.println("SQUEAK");
    }
}

/**
 * Lab 3: Inheritance, Interfaces, Hash, Design Pattern and Big Number <br />
 * The {@code Bison} class
 */
class Bison implements Animal {
    /**
     * The bison speaks
     */
    public void speak() {
        System.out.println("BELLOW");
    }
}

/**
 * Lab 3: Inheritance, Interfaces, Hash, Design Pattern and Big Number <br />
 * The {@code AnimalType} class
 */
class AnimalType {
    /**
     * Create and return an animal
     *
     * @param criteria {@code String} how is the animal like
     * @return {@code Animal} the animal
     */
    public static Animal getAnimal(String criteria) {
        if (criteria.equals("small"))
            return new Mouse();
        else if (criteria.equals("big"))
            return new Bison();
        else if (criteria.equals("lazy"))
            return new Lion();
        return null;
    }
}

/**
 * Lab 3: Inheritance, Interfaces, Hash, Design Pattern and Big Number <br />
 * The {@code JavaDPExample} class
 */
public class JavaDPExample {
    /**
     * Main entry
     *
     * @param args {@code String[]} Command line arguments
     */
    public static void main(String[] args) {
        AnimalType.getAnimal("small").speak();
        AnimalType.getAnimal("big").speak();
        AnimalType.getAnimal("lazy").speak();
    }
    // TODO: Lab 3 Part 3 -- Answer the design pattern questions
    /* Answers to questions
    1. Since getAnimal is a utility class (it does/returns something) without changing internally. It is a essentially
    "getter" function and as such. Rather it simply takes in
    arguments and return outputs. In getAnimal this is used to allow specifying a "key" for an animal, and properly
    return a new instance of that animal (which is then later used with the Animal interface method speak()). Doing
    this allows for instantiation of animal object cleanly as getAnimal is element of the animalType class not object.
    Also getAnimal is related to animals but fails to be any
    specific animal (rather it allows for initialization of a specified animal) thus it fits into the category of
    static methods. TODO
    2. Factory pattern
    3. This allows for: the creation of different types of animals simply, without type specification (at top level),
    and all animals are then created using a common standardized interface. TODO
     */
}
