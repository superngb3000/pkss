package com.company;

import java.util.HashMap;
import java.util.Map;

public class Functions {
    public String ex3(double a, double b, double c, double x, double y){
        String result = "Кирпич не пройдет в отверстие";
        if((a <= x && b <=y) || (b <= x && a <=y))
            result = "Кирпич пройдет в отверстие";
        else if((a <= x && c <=y) || (c <= x && a <=y))
            result = "Кирпич пройдет в отверстие";
        else if((c <= x && b <=y) || (b <= x && c <=y))
            result = "Кирпич пройдет в отверстие";
        return result;
    }

    public Map<String, Double> ex6(double a, double b, double c){
        Map<String, Double> result = new HashMap<>();
        if ((a < b) && (b < c))
            a = b + c;
        else
            a = c - b;
        result.put("A", a);
        return result;
    }

    public String ex9(double a, double r){
        String result = "Окружность и квадрат пересекаются";
        double dg = a / Math.sqrt(2);
        if (r == dg)
            result = "Квадрат вписан в окружность";
        else if (r > dg)
            result = "Квадрат внутри окружности";
        else if (r == a / 2)
            result = "Окружность вписана в квадрат";
        else if (r < a / 2)
            result = "Окружность внутри квадрата";
        return result;
    }

    public Map<String, Double> ex12(double a, double b){
        Map<String, Double> result = new HashMap<>();
        if ((a < 0) && (b < 0)){
            a = a * a;
            b = b * b;
        }
        else {
            if (a > 0)
                a = 2 * a;
            if (b > 0)
                b = 2 * b;
        }
        result.put("A", a);
        result.put("B", b);
        return result;
    }

    public Map<String, Double> ex15(double a, double b){
        Map<String, Double> result = new HashMap<>();
        if ((a >= 0) && (b >= 0)){
            a = Math.pow(a, 3);
            b = Math.pow(b, 3);
        }
        else {
            if (a < 0)
                a = Math.abs(a);
            if (b < 0)
                b = Math.abs(b);
        }
        result.put("A", a);
        result.put("B", b);
        return result;
    }
}
