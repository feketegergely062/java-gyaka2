/*
* File: Paralerogramma.java
* Author: Fekete Gergely
* Copyright: 2023, Fekete Gergely
* Group: Szoft 1/N
* Date: 2023-02-06
* Github: https://github.com/feketegergely062/
* Licenc: GNU GPL
*/
public class Paralelogramma {
    double calcArea(double a, double b, double gamma){
        double rad = gamma * Math.PI / 180;
        double area = a * b * Math.sin(rad);
        return area;

    }
}
