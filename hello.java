public class HelloWorld {
    private String greeting = "Hello, World!";

    // Getter method for greeting
    public String getGreeting() {
        return greeting;
    }

    // Setter method for greeting
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    // Method to print the greeting
    public void greet() {
        System.out.println(greeting);
    }

    public static void main(String args[]) {
        HelloWorld helloworld = new HelloWorld();
        helloworld.greet();

        // Using the setter to change the greeting
        helloworld.setGreeting("Hello, Java!");
        helloworld.greet();
    }
}
