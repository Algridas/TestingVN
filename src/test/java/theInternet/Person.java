package theInternet;

public class Person {
    String firstname;
    String lastname;
    Double due;

    public Person(String firstname, String lastname, Double due) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.due = due;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFullname() {
        System.out.printf("%s %s", this.firstname, this.lastname);
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Double getDue() {
        return due;
    }

    public void setDue(Double due) {
        this.due = due;
    }
}
