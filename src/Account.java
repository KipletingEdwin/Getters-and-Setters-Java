public class Account {
    String name;
    int age;

    public  static  void main(String[] args){
        Account a = new Account();
        a.setName("Edwin");
        a.setAge(29);
        System.out.println(a.getAge());
        System.out.println(a.getName());

        a.printDetails();
    }

    //GETTERS

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public  void  printDetails(){
        System.out.println(getName() + ", " + getAge());
    }
}
