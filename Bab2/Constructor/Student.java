public class Student {
     private String name;
     private String address;
     private int age;
     private int jumlah;
     private double mathGrade;
     private double englishGrade;
     private double scienceGrade;
     private double average;
     public Student(){
     name = "";
     address = "";
     age = 0;
     }
     public Student(String n, String a, int ag){
     name = n;
     address = a;
     age = ag;
     }
     public Student(double math, double english, double science){
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
     }
     public void setName(String n){
     name = n;
     }
     public void setAddress(String a){
     address = a;
     }
     public void setAge(int ag){
     age = ag;
     }
     public void setMath(int math){
     mathGrade = math;
     }
     public void setEnglish(int english){
     englishGrade = english;
     }
     public void setScience(int science){
     scienceGrade = science;
     }
     private double getAverage(){
     double result = 0;
     result = (mathGrade+scienceGrade+englishGrade)/3;
     return result;
     }

     //method statusakhir
public boolean statusAkhir(){
    if (average >= 61){
    return true;
    }else{
    return false;
    }
    }
    public void displayMessage(){
    System.out.println("Siswa dengan nama "+name);
    System.out.println("beramalat di "+address);
    System.out.println("berumur "+age);
    System.out.println("mempunyai nilai rata rata"+getAverage());
    //menampilkan method statusAkhir
    if (statusAkhir() == false){
    System.out.println( "Siswa dinyatakan lolos");
    }else{
    System.out.println( "Siswa diharuskan mengikuti remidi");    }
    
     }
     public void jumlahObjek(){
        System.out.println("banyaknya objek yang telah dibuat " + jumlah);
     }
    public void setMark(int i) {
    }
     }