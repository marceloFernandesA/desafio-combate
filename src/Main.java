import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        int life,attack,armor;

        Champion champion_1;
        Champion champion_2;

        System.out.println("Digite os dados do primeiro campeão");
        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Vida Inicial: ");
        life = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        System.out.print("Armadura: ");
        armor = sc.nextInt();

        champion_1 = new Champion(name, life, attack, armor);

        System.out.println();

        System.out.println("Digite os dados do segundo campeão");
        System.out.print("Nome: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Vida Inicial: ");
        life = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        System.out.print("Armadura: ");
        armor = sc.nextInt();

        champion_2 = new Champion(name, life, attack, armor);

        System.out.println();

        System.out.print("Quantos turnos você deseja executar? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println();
                if(champion_1.getLife() > 0 && champion_2.getLife() > 0) {
                System.out.printf("Resultado do turno %d:%n", i+1);
                champion_1.takeDamage(champion_2);
                System.out.println(champion_1);
                champion_2.takeDamage(champion_1);
                System.out.println(champion_2);
            }
            else {
                i = n;
            }
        }

    }
}