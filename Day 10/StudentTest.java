package Day 10;
class Student{
    String Name;
    int Roll_no;
    int Percentage;

    public void setNmae(String name){
        this.Name = name;
    }
    public void setRoll_no(String roll.no){
        this.Roll.no = roll.no;
    }
    public void setPercentage(String percentage){
        this.Percentage = percentage;
    }

    public String getName(){
        return Name;
    }
    public int getRoll_no(){
        return Roll_no;
    }
    public String getPercentage(){
        return Percentage;
    }

}
public class StudentTest {
    Student s = new Student();
    s.setName("aji");
    s.setRoll_no(1);
    s.setPercentage(80%);
    System.out.println("Name: "+ s.getName());
    System.out.println("Roll.no: "+ s.getRoll_no());
    System.out.println("Percentage: "s.percentage());
}
