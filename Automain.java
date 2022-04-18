import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Automain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Auto> Autot= new ArrayList<>();
        boolean kaynnissa = true;
        while (kaynnissa){
            System.out.println("1.Lisaa ajoneuvo, 2. Hae ajoneuvot 3. Poista ajoneuvo, 4.Hae ajoneuvo, 5. Muokka tietoja 6. Lopeta : ");
            String valinta = scanner.next();
            switch(valinta){
                default:
                    break;
                case "1":
                    System.out.println("Anna Merkki: ");
                    String aMerkki = scanner.next();
                    System.out.println("Anna Malli: ");
                    String aMalli = scanner.next();
                    System.out.println("Anna Vuosmalli: ");
                    int aVuosimalli = scanner.nextInt();
                    System.out.println("Anna Vari: ");
                    String aVari = scanner.next();
                    Autot.add(new Auto(aMerkki, aMalli, aVuosimalli, aVari));
                    break;

                case "2":
                    if(Autot.isEmpty()){
                        System.out.println("Tietokanta tyhjä");
                        break;
                    }
                    for (Auto  a: Autot){
                        a.Tulostatiedot();
                    }
                    break;

                case "3":
                        System.out.println("Poistetaanko yksi vai kaikki(y tai k): ");
                        String vastaus = scanner.next();
                        if(vastaus.equals("k")){
                            Autot.clear();
                            break;
                        }
                        if(vastaus.equals("y")){
                            for(Auto n: Autot) {
                                for(Auto a: Autot) {
                                    System.out.println(a.getmMerkki()+ " " + a.getmMalli()+ " " + a.getmVuosimalli()+ " " + a.getmVari());
                                }
                                System.out.println("Anne merkki: ");
                                String merkki = scanner.next();
                                if(n.getmMerkki().equals(merkki)) {
                                    System.out.println("Anna malli: ");
                                    String malli = scanner.next();
                                    if(n.getmMalli().equals(malli)){
                                        System.out.println("Anna vuosimalli: ");
                                        int vuosimalli = scanner.nextInt();
                                        if(n.getmVuosimalli() == vuosimalli){
                                            System.out.println("Anna vari: ");
                                            String vari = scanner.next();
                                            if (n.getmVari().equals(vari)) {
                                                Autot.remove(n);
                                                break;
                                            }
                                            else{System.out.println("ei loydy varia: "+ vari);}
                                        }
                                        else{System.out.println("ei loydy vuosimallia: "+ vuosimalli);}
                                    }
                                    else{System.out.println("ei loydy mallia: "+ malli);}
                                }
                                else{System.out.println("ei loydy merkkia: "+ merkki);
                                }
                                break;
                            }
                        }
                        break;
                case "4":
                    if(Autot.size() ==1){
                        for(Auto y: Autot){
                            y.Tulostatiedot();
                            break;
                        }
                        break;
                    }

                    if(Autot.isEmpty()){
                        System.out.println("Tietokanta tyhjä");
                        break;
                    }
                    System.out.println("Anne merkki: ");
                    String merkki = scanner.next();

                    for(Auto n: Autot) {
                        if (n.getmMerkki().equals(merkki)) {
                            n.Tulostatiedot();
                        }
                    }

                    System.out.println("Anna Malli tarkempaa hakua varten(voit myö palata aloitukseen kirjoittamalla 'exit': ");
                    vastaus = scanner.next();
                    if (vastaus.equals("exit")){
                        break;
                    }
                    else {
                        for(Auto x: Autot) {
                            if (x.getmMerkki().equals(merkki)) {
                                if (x.getmMalli().equals(vastaus)) {
                                    x.Tulostatiedot();
                                    break;
                                    }
                                }
                            }
                        }
                    break;

                case "5":
                    int i = 0;
                    for(Auto n: Autot) {
                        System.out.println( i+ " " +n.getmMerkki()+  " " + n.getmMalli()+ " " + n.getmVuosimalli()+ " " + n.getmVari());
                        i++;
                    }
                    System.out.println("Anna auton numero jonka tietoja haluat muuttaa");
                    i = scanner.nextInt();
                    System.out.println("Anna numero mitä kohtaa haluat muuttaa");
                    System.out.println(" 1. " + Autot.get(i).getmMerkki()+ " 2. "  + Autot.get(i).getmMalli()+ " 3. " + Autot.get(i).getmVuosimalli()+ " 4. " + Autot.get(i).getmVari());
                    int x = scanner.nextInt();
                    if (x ==1){
                        System.out.println("Anna uusi merkki: ");
                        aMerkki = scanner.next();
                        Autot.get(i).setmMerkki(aMerkki);
                        break;
                    }
                    if (x ==2){
                        System.out.println("Anna uusi Malli: ");
                        aMalli = scanner.next();
                        Autot.get(i).setmMalli(aMalli);
                        break;
                    }
                    if (x ==3){
                        System.out.println("Anna uusi VuosiMalli: ");
                        aVuosimalli = scanner.nextInt();
                        Autot.get(i).setmVuosimalli(aVuosimalli);
                        break;
                    }
                    if (x ==4){
                        System.out.println("Anna uusi Vari: ");
                        aVari = scanner.next();
                        Autot.get(i).setmVari(aVari);
                        break;
                    }
                    break;
                case "6":
                    Autot.clear();
                    kaynnissa = false;
                    break;
            }
        }
    }
}