import java.util.Scanner;

public class MainStudentt {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println( "Input banyaknya siswa: ");
    int jml_siswa = input.nextInt();

    Student[] siswa = new Student[jml_siswa];

    for(int i=0; i<jml_siswa; i++){
        System.out.println("Data siswa ke-" + (i+1));
        System.out.print("Input nama siswa It: ");
        String name = input.nextLine();
        System.out.print( "Input alamat siswa : ");
        String address = input.nextLine();
        System.out.print( "Input umur siswa It: ");
        int age = input.nextInt();
        System.out.print( "Input nilai matematika it: ");
        int math = input.nextInt();
        System.out.print( "Input nilai bahasa inggris It: ");
        int english = input.nextInt();
        System.out.print( "Input nilai ipa It: ");
        int science = input.nextInt();
        
        siswa[i] = new Student();
        siswa[i].setName(name);
        siswa[i].setAddress(address);
        siswa[i].setAge(age);
        siswa[i].setMath(math);
        siswa[i].setEnglish(english);
        siswa[i].setScience(science);

    }
    input.close();

    System. out.println( "In");
    System.out.println( "Data siswa : ");
    for(int i=0; i<jml_siswa; i++){
        System.out.println("Siswa ke-" + (i+1));
        siswa[i].displayMessage();
    }
}
            
        }
