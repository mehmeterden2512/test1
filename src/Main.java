import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//burası toplama işlemi yapar
        int mehmet = -5;
        System.out.println("Ben toplama işlemi yaparım. Sayı giriniz: ");
        int number2 = input.nextInt();
        int result = mehmet + number2;
        System.out.println(result);

//burası kullanıcı bilgileri almak için kulanılır
        System.out.println("Ad giriniz: ");
        String name = input.next();
        System.out.println("Soyad giriniz: ");
        String surname = input.next();

        String nameSurname = name+ " "+ surname;
        System.out.println("kullanıcı bilgileri: "+ nameSurname);
        System.out.println(("sayı gir: "));

// hangi sayıyı girersen o sayının karşılığındaki yazıyı ekrana yazar
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("mehmet");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
// Outputs "Thursday" (day 4)
    }
}