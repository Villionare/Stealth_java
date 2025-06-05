package ZERO;

//In Java, an initializer block is a block of code enclosed in curly braces {} that is used to initialize fields or perform other setup tasks
// when a class is loaded or an object is created. There are two main types of initializer blocks:

//Static Initializer Block (Static Block)
//Instance Initializer Block (IIB)

public class InitializerBlock {

        static int staticVar;

        //static block can only access static variables and functions
        static {
            System.out.println("Static block 1 executed.");
            staticVar = 10; // Initialize static variable
        }

        static {
            System.out.println("Static block 2 executed.");
            // More static initialization
        }

        public InitializerBlock() {
            System.out.println("Constructor executed.");
        }

    //Instance Initializer Block (IIB) - they can access both static and non - static
    //An instance initializer block is a block of code without the static keyword.
    //instance initializer block is callled everytime a object is created. It runs before the constructor of the class.
    int instanceVar;

    { // Instance Initializer Block 1
        System.out.println("Instance Initializer Block 1 executed.");
        instanceVar = 5; // Initialize instance variable
    }

    { // Instance Initializer Block 2
        System.out.println("Instance Initializer Block 2 executed.");
    }

    public static void main(String[] args) {
            System.out.println("Main method executed.");
            InitializerBlock obj1 = new InitializerBlock();
            InitializerBlock obj2 = new InitializerBlock();
            System.out.println("Static variable value: " + staticVar);
        }
}
