package week3;

import java.util.Scanner;
/*
Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
Write the following methods (instance methods):
 */
public class Programme14_Person {

    public static class Person {
        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            if (age >= 0 && age <= 100) {
                this.age = age;
            } else {
                this.age = 0;
            }
        }

        public boolean isTeen() {
            return (age > 12 && age < 20);
        }

        public String getFullName() {
            String fullName = "";
            if (!firstName.isEmpty()) {
                fullName += firstName;
            }
            if (!lastName.isEmpty()) {
                if (!fullName.isEmpty()) {
                    fullName += " ";
                }
                fullName += lastName;
            }
            return fullName;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Person person = new Person();

            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();
            person.setFirstName(firstName);

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();
            person.setLastName(lastName);

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            person.setAge(age);

            System.out.println("Full Name: " + person.getFullName());
            System.out.println("Teen: " + person.isTeen());
        }
    }
}
