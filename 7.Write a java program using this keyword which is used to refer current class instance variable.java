public class StudentInfo {
    int id;
    String name;

    StudentInfo(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println((id + " "+ name));

    }
    public static void main(String args[]){
        StudentInfo std_1 = new StudentInfo(01,"Proshanta ");
        StudentInfo std_2 = new StudentInfo(02,"Rakesh");
        std_1.display();
        std_2.display();
    }
}
