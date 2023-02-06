/*
* File: MainConsole.java
* Author: Fekete Gergely
* Copyright: 2023, Fekete Gergely
* Group: Szoft 1/N
* Date: 2023-02-06
* Github: https://github.com/feketegergely062/
* Licenc: GNU GPL
*/
import java.util.Scanner;

public class MainConsole {


    

        public MainConsole() {
            about();
            task();
            doit();
        }
        private void task(){
            System.out.println("Paralerogramma Területe");
            System.out.println("Feladat 0251 megoldasa");
    
           
            
        }
        private void about(){
            System.out.println("Fekete Gergely");
            System.out.println("Szoft 1/N");
            System.out.println("2023.02.06");
        }
        private String input(String msg){
            System.out.print(msg);
            Scanner scanner = new Scanner(System.in);
            String value = scanner.nextLine();
            return value;
        } 
        private void doit(){
            String a = input("A oldal: ");
            String b = input("B oldal: ");
            String gamma = input("Gamma szog: ");

            double aside = Double.parseDouble(a);
            double bside = Double.parseDouble(b);
            double gammaSZ = Double.parseDouble(gamma);

            Paralelogramma para = new Paralelogramma();
            double area = para.calcArea(aside, bside, gammaSZ);
            System.out.printf("%.2f\n",area);
        }

    }
        
    

