package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double distance = 1;
        double fee =0.10;
        int age;
        double ageDiscount= 1;
        int flightType;
        double flightTypeDiscount = 1;
        double amountN=1;
        double amountDA = (amountN*ageDiscount);
        double amountDF = (amountN*flightTypeDiscount);
        double total = amountN-(amountDF+amountDA);


        Scanner input = new Scanner(System.in);
        System.out.print("\n ~ Patika Havayollarına hoşgeldiniz ~ \n " +
                "Lütfen gitmek istediğiniz mesafeyi km cinsinden giriniz : ");
        distance = input.nextDouble();
        amountN  = (distance*fee);

        System.out.print(" Tercih ettiğiniz bilet tipini belirtiniz \n" +
                " - Tek seferli yolculuk için 1'i\n" +
                " - Gidiş-Dönüş seferleri için 2'yi seçiniz : ");
        flightType = input.nextInt();
        switch (flightType){
            case 1 :
                if (flightType==1){
                    flightTypeDiscount = 0;
                    amountDF = amountN*flightTypeDiscount;
                    System.out.println("İndiriminiz bulunmamaktadır");
                }
                break;
            case 2 :
               if (flightType == 2){
                   flightTypeDiscount = 0.2;
                   amountDF = amountN*flightTypeDiscount;

                   System.out.println("Gidiş-Dönüş seferleri için %20 indirim bulunmaktadır.");
               }
                break;
        }

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        switch (age){
            case 1 :
                if (age<12){
                    ageDiscount = 0.5;
                    amountDA = amountN*ageDiscount;
                    System.out.println("0-12 yaş aralığı için %50 indiriminiz bulunmaktadır");
                }
                break;
            case 2 :
                if ((age>=12)&&(age<=24)){
                    ageDiscount = 0.2;
                    amountDA = amountN*ageDiscount;
                    System.out.println("12-24 yaş aralığı için %20 indiriminiz bulunmaktadır");
                }
                break;

            case 3 :
                if (age>=65){
                    ageDiscount = 0.3;
                    amountDA = amountN*ageDiscount;
                    System.out.println("65+ yolcuların %30 indirimi bulunmaktadır");
                }
        }
        System.out.println(" Bilet bilgileriniz \n" +
                "Yaşınız : "+age+ " | Yaş indiriminiz : "+ ageDiscount+ " | Uçuş tercihiniz : "+ flightType+" | Uçuş indiriminiz : "+flightTypeDiscount);
        total = amountN-(amountDF+amountDA);
        System.out.println("Toplam tutar : "+ total);






    }
}

