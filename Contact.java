public class Contact {
    public String name;
    public String email;
    public String number;
    public Contact(String name, String email, String number){
        this.name = name;
        this.email = email;
        this.number = number;
    }
    public String pName(){
        return name;
    }
    public String pNumber(){
        return number;
    }
    public String pEmail(){
        return email;
    }
    public String convertString() {
        return "Name: " + name + " ,Number: " + number + " ,Email: " + email;}
}