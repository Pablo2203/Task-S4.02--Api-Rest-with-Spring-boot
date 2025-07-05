package cat.itacademy.s04.t02.n01.exception;

public class FruitNotFoundException extends RuntimeException {

    // Constructor que acepta un mensaje personalizado.
    public FruitNotFoundException(String message) {
        super(message); // Llama al constructor de la clase RuntimeException.
    }
}
