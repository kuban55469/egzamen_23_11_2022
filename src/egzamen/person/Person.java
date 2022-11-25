package egzamen.person;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, int age, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        if (age > 0 && age < 127) {
            this.age = age;
        }else {
            System.out.println("Жаш туура эмес берилип жатат !");
        }
        if (email.contains("@")) {
            this.email = email;
        }else {
            System.out.println("Email туура эмес, «@» жок !");
        }
        if (phoneNumber.substring(0,4).contains("+996")) {
            this.phoneNumber = phoneNumber;
        }else {
            System.out.println("+996 жок !");
        }
        if (phoneNumber.length() == 13){
            this.phoneNumber = phoneNumber;
        }else {
            System.out.println("Номер туура эмес!!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void placeOfWork(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

