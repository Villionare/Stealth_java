package ZERO;

    class methodChaining {
        private String name;
        private int age;
        private String city;

        public methodChaining setName(String name) {
            this.name = name;
            return this; // Return the current object
        }

        public methodChaining setAge(int age) {
            this.age = age;
            return this; // Return the current object
        }

        public methodChaining setCity(String city) {
            this.city = city;
            return this; // Return the current object
        }

        public void display() {
            System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
        }

        public static void main(String[] args) {
            // Method chaining in action
            new methodChaining()
                    .setName("Bob")
                    .setAge(25)
                    .setCity("London")
                    .display();

            // Or with an intermediate variable
            methodChaining person2 = new methodChaining();
            person2.setName("Charlie")
                    .setAge(40)
                    .setCity("Paris")
                    .display();
        }
    }
