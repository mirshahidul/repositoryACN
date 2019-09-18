public class GenSet<E> {
    private E a[];

    public GenSet() {
        a = new E[INITIAL_ARRAY_LENGTH]; // error: generic array creation
    }
}
