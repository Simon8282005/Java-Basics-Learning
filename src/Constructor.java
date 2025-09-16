public class Constructor {
    int age;
    String name;
    float bmi;

    /*
    Constructor() {  // Consturctor with no parameter
        x = 5;
    }
    */
    public Constructor(int new_age, String new_name, float new_bmi) {
        age = new_age; name = new_name; bmi = new_bmi;
    }

    public static void main(String[] args) {
        Constructor con = new Constructor(20, "Simon", 21.0f);
        System.out.println("Name: " + con.name);
        System.out.println("Age: " + con.age);
        System.out.printf("Bmi: %.2f", con.bmi);
    }
}


