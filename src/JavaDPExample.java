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
    "getter" function or "factory pattern" entrance. As such its useful to make it within its own class (thus
    segregating the "factory" from other working code). Additionally since we know that this factory method shouldn't
    be changing throughout its life, making it static method (thus making the factory getAnimal method a "class"
    method) has been done. This allows getAnimal to be called without constructing a object, thus, the
    AnimalType class simply needs to be called with the getAnimal method being addressed appropriately.
    2. Factory pattern
    3. This allows for: the creation of different types of animals simply, without type specification (at top level),
    and all animals are then created using a common standardized interface. Using a factory pattern and isolating the
    factory entrance to a static method in a isolated class, locks down the specific classes (outside of this package)
    that generate unique animals and ensures that creation of generic animal classes follows the method of getAnimal.
    This use of using a static Animal returning method also ensures that animals (including future newly implemented
    classes) created are always based off the animal interface (if not it will error before compilation). This "factory
    pattern" creates a Animal standard and makes implementation consistent. TODO

     */
}
