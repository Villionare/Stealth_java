package ZERO;

public class PassByValue {
        public static void modifyPrimitive(int num) {
            num = num + 10; // Modifies the *copy* of 'num'
            System.out.println("Inside method: num = " + num);
        }

        public static void main(String[] args) {
            int x = 5;
            System.out.println("Before method call: x = " + x); // Output: 5
            modifyPrimitive(x);
            System.out.println("After method call: x = " + x);  // Output: 5 (original 'x' is unchanged)

        //java always does call by value means its create the copy of the original variable, (wont affect the original)
        //but in case of passing an Reference data type (object), as it doesn't passes the original value but the copy of the memory address
        //so if you manipulate the value then the original value will be manipulated too
        // In pass by reference, a direct reference to the variable is passed, meaning that changes made to the parameter inside the function will directly affect the original variable.
        }
    }
