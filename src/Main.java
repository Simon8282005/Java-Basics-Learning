public class Main {
    public static class Person {
        private String name;
        private String adress;
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int new_age) {
            age = new_age;
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(10);
        int age = person.getAge();

        System.out.println("Age: " + age);
    }
}