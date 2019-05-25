import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("D:\\Documentz\\Cool info stuff\\Proiect_info_OOP\\Proiect_info_OOP\\src\\parcare.txt");
        Scanner sc = new Scanner(input);

        ArrayList<Autovehicul> parcare = new ArrayList<>();
        /*
        MOD CITIRE:

        ['TIP'] AN "BRAND" "MODEL" "CULOARE" 'CONFIG' NR_CILINDRII CAPACITATE PUTERE CUTIE_VITEZE ["PARAMETRU_SPECIFIC"] MASA VALOARE

        ['TIP'] -> Se scrie S/T/A/M, in functie de subclasa autovehiculului ce urmeaza sa fie citit

        ["PARAMETRU_SPECIFIC"] -> Se scrie tractiune/masa_remorca/tip_teren/clasa

        */

        int nrVehicule = sc.nextInt();

        for(int i=1;i<=nrVehicule;i++) {

            String tip_curent = sc.next();
            switch (tip_curent){
                case ("S"):{

                    int an_fab = sc.nextInt();
                    String brand = sc.next();
                    String model = sc.next();
                    String culoare = sc.next();
                    Motor motor = new Motor();
                    motor.config = sc.next();
                    motor.nr_cilindrii = sc.nextInt();
                    motor.capacitate = sc.nextFloat();
                    int putere = sc.nextInt();
                    String cutie_v = sc.next();
                    String tractiune = sc.next();
                    int masa = sc.nextInt();
                    int val = sc.nextInt();

                    Sedan sedan_curent = new Sedan(an_fab, brand, model, culoare, motor, cutie_v, putere, tractiune, masa, val);
                    parcare.set(i, sedan_curent);
                    break;
                }
                case ("T"):{

                    int an_fab = sc.nextInt();
                    String brand = sc.next();
                    String model = sc.next();
                    String culoare = sc.next();
                    Motor motor = new Motor();
                    motor.config = sc.next();
                    motor.nr_cilindrii = sc.nextInt();
                    motor.capacitate = sc.nextFloat();
                    int putere = sc.nextInt();
                    String cutie_v = sc.next();
                    int masa_rem = sc.nextInt();
                    int masa = sc.nextInt();
                    int val = sc.nextInt();

                    TIR tir_curent = new TIR(an_fab, brand, model, culoare, motor, cutie_v, putere, masa_rem, masa, val);
                    parcare.set(i, tir_curent);
                    break;
                }
                case ("A"):{

                    int an_fab = sc.nextInt();
                    String brand = sc.next();
                    String model = sc.next();
                    String culoare = sc.next();
                    Motor motor = new Motor();
                    motor.config = sc.next();
                    motor.nr_cilindrii = sc.nextInt();
                    motor.capacitate = sc.nextFloat();
                    int putere = sc.nextInt();
                    String cutie_v = sc.next();
                    String tip_teren = sc.next();
                    int masa = sc.nextInt();
                    int val = sc.nextInt();

                    ATV atv_curent = new ATV(an_fab, brand, model, culoare, motor, cutie_v, putere, tip_teren, masa, val);
                    parcare.set(i, atv_curent);
                    break;
                }
                case ("M"):{

                    int an_fab = sc.nextInt();
                    String brand = sc.next();
                    String model = sc.next();
                    String culoare = sc.next();
                    Motor motor = new Motor();
                    motor.config = sc.next();
                    motor.nr_cilindrii = sc.nextInt();
                    motor.capacitate = sc.nextFloat();
                    int putere = sc.nextInt();
                    String cutie_v = sc.next();
                    String clasa = sc.next();
                    int masa = sc.nextInt();
                    int val = sc.nextInt();

                    Motocicleta moto_curent = new Motocicleta(an_fab, brand, model, culoare, motor, cutie_v, putere, clasa, masa, val);
                    parcare.set(i, moto_curent);
                    break;
                }
            }
        }
        System.out.print(parcare.get(1).getAnFabricatie());
    }
}
