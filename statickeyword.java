public class statickeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.schoolname = "National";
        Students s2 = new Students();
        System.out.println(s2.schoolname);
        Students s3 = new Students();
        s3.schoolname = "Nal";
    }
}
class Students{
    String name;
    int roll;

    static String schoolname;
    void setName(String name){
        this.name = name;
    }
    String getName(String name){
        return this.name;
    }
}