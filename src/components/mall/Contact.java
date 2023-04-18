package components.mall;

public class Contact {
    private String name;
    private String surname;
    private String phoneNumber;
    private String address;
    private String email;

    public Contact(String name, String surname, String phoneNumber,String email, String address) {
            this.name = name;
            this.surname = surname;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.email = email;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) this.name = name;
        else{
            System.out.println("Contact - Name can't be null!");
            System.exit(0);
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname != null) this.surname = surname;
        else{
            System.out.println("Contact - Surname can't be null!");
            System.exit(0);
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber != null) this.phoneNumber = phoneNumber;
        else{
            System.out.println("Contact - Phone Number can't be null!");
            System.exit(0);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address != null) this.address = address;
        else{
            System.out.println("Contact - Address can't be null!");
            System.exit(0);
        }
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null) this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

