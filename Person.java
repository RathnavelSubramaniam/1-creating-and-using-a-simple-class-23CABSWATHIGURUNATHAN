class Person
{
    String firstName;
    String lastName;
    int age;
    Person()
    {
     firstName="";
     lastName="";
     age=0;
    }
    Person (String Fname,String Lname,int a)
    {
        firstName=Fname;
        lastName=Lname;
        age=a;
    }
    String getFullName()
    {
        return firstName+" "+lastName;
    }
    public  static void main (String agrs[])
    {
        Person Person1=new Person ("John", "Doe",30);
        Person Person2=new Person ("Alice","Smith",25);
        System.out.println("Person 1: "+Person1.getFullName());
        System.out.println("Person 2: "+Person2.getFullName());
        double average=(Person1.age+Person2.age)/2.0;
        System.out.println("Average Age: "+average);
    }
}