public class Student {
    /* Create any necessary variables here */


    /**
     * Initialises the class information including student name, postcode,
     * address and gpa.
     *
     * @param name The student's name.
     * @param address The student's current residential address.
     * @param postCode The student's current residential postcode.
     * @param gpa The student's current gpa.
     */
    public Student(String name, String address, int postCode, double gpa) {
        this.name = name;
        this.address = address;
        this.postCode = postCode;
        this.gpa = gpa;
    }

    /**
     * Returns the student's name.
     * @return Student's name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the student's address.
     * @return Student's address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the student's postcode.
     * @return Student's postcode.
     */
    public int getPostCode() {
        return postCode;
    }

    /**
     * Returns the student's gpa.
     * @return Student's gpa.
     */
    public double getGPA() {
        return gpa;
    }

    /**
     * Change the student's name.
     * @param name Student's new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Change the student's address.
     * @param address Student's new address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Change the student's postcode.
     * @param postCode Student's new postcode.
     */
    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }
    
    /**
     * Change the student's gpa.
     * @param gpa Student's new gpa.
     */
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }



    public static void main(String[] args){
        Student student = new Student("Harry Keightley", "1234 Elm Street", 4023, 7.0);
        System.out.println(student.getName().equals("Harry Keightley"));
    }
}