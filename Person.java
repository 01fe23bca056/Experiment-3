import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date dob;  // Date of birth
    private int age;

    // Constructor
    public Person(String name, String dobString) {
        this.name = name;
        this.dob = parseDate(dobString);
        this.age = calculateAge(dob);
    }

    // Method to parse the date string into Date object
    private Date parseDate(String dobString) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = sdf.parse(dobString);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        return date;
    }

    // Method to calculate age from DOB
    private int calculateAge(Date dob) {
        long timeDifference = new Date().getTime() - dob.getTime();
        long ageInMillis = timeDifference / (1000L * 60 * 60 * 24 * 365);
        return (int) ageInMillis;
    }

    // Method to display person's information
    public void displayPersonInfo() {
        System.out.println("Person Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Example usage
        Person person = new Person("Alice Smith", "15-04-1990");
        person.displayPersonInfo();
    }
}
