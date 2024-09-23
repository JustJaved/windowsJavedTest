class student
{
    String name;
    int rollno,marks;

    void display()
    {
        System.out.println("Student's data: ");
        System.out.println("Name of student is:"+name);
        System.out.println("Roll number of student is:"+rollno);
        System.out.println("Marks of student is:"+marks);

    }
    void percentage()
    {
        double p=(marks*100)/100;
        System.out.println("Percentage of Student is"+p+"%");
    }
}

class studentex
{
    public static void main(String args[])
    {
    student s1=new student();
    student s2=new student();

    s1.name="Javed";
    s1.rollno=1;
    s1.marks=89;

    s2.name="aman";
    s2.rollno=2;
    s2.marks=92;

    s1.display();
    s1.percentage();
    
    s2.display();
    s2.percentage();

}
}
