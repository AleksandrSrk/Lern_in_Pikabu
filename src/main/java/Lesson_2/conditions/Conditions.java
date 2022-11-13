package Lesson_2.conditions;

public class Conditions {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        boolean result = x > y;

        if (x > y) { // если икс больше игрека, условие выполняется
            System.out.println("X больше");
        } else if (x == y) {
            System.out.println("X равен Y");
        } else {
            System.out.println("X меньше");
        }

        // БУЛЕВА ЛОГИКА (переменные булевы начинаются с is)
        // Купить хлеб и молоко

        boolean isMilkBought = true;
        //boolean isBreadBought = true;
        boolean isBreadBought = false;
        boolean resultForMom = isBreadBought && isMilkBought;
        // boolean resultForMom = true && true = true
        if (resultForMom) {
            System.out.println("Мальчик купил хлеб и молоко");
        } else if (isMilkBought){
            System.out.println("Мальчик не купил хлеб");
        } else if (isBreadBought){
            System.out.println("Мальчик не купил молоко");
        } else {
            System.out.println("Мальчик не купил молоко и не купил хлеб");
        }
        // Купи хлеб или молоко или и то и то
        boolean resultForMomOr = isMilkBought || isBreadBought;
//        boolean resultForMomOr = true||true;
//        boolean resultForMomOr = true;
//
//        boolean resultForMomOr = false||true;
//        boolean resultForMomOr = true;
//
//        boolean resultForMomOr = false||false;
//        boolean resultForMomOr = false;

        // Купи хлеб и что то из сладости, шоколад или конфеты
        boolean isbread = true;
        boolean isChokolate = true;
        boolean isCandy = false;
//        boolean resultForMomAll = isbread && (isChokolate || isCandy);
//        boolean resultForMomAll = false && (true);
//        boolean resultForMomAll = false;
//
//        boolean resultForMomAll = isbread && isChokolate || isCandy;
//        boolean resultForMomAll = false || true;
//        boolean resultForMomAll = true;
    }
}
