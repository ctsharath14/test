/*create an online banking platform for routine banking operations like creating an account
money withdrawal, money deposit, balance enquiry, etc.*/

package Banking;

public class Bank {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Account{Name: "+getName()+", Age: "+getAge()+", Address: "+getAddress()+"}";
    }
}
