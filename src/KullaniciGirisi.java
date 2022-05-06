import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String  name = "ömer",pw = "1525458",newPassword,username,pasword;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen Kullanici adi Giriniz :");
        username = inp.nextLine();
        System.out.print("Lutfen Kullanici Sifre Giriniz :");
        pasword = inp.nextLine();


        if (username.equals(name) && pasword.equals(pw)){
            System.out.print("Giris Yaptınız");

        }else if (!pasword.equals(pw)){
            System.out.print("Kullanici Bilgileriniz Yanlis");
            System.out.print("Sifresinizi Sifirlamak İstermisiniz 1 evet 2 hayır :");
            int secim;
            secim = inp.nextInt();
            switch (secim){

                case 1:
                    Scanner input = new Scanner(System.in);
                    System.out.print("Yeni Şifre giriniz:");
                    newPassword = input.nextLine();


                    if (newPassword.equals(pw) ){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");


                    }else {
                        System.out.print("Sife Olusturuldu");

                    }
                    break;
                case 2:
                    System.out.println("İyi Günler");
                    break;
                default:
                    System.out.print("Gecersiz islem");
                    break;
            }


        }
    }
}
