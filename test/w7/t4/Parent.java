public abstract class Parent {
    public Parent() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void nonAbstract() {
        System.out.println("This is a normal method of abstract class");
    }
}
