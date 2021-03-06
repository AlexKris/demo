package com.example.demo.study.effectivejava.article2;

public class TestBuilder {
    public static void main(String[] args) {
        NutritionFacts cocaCola =
                new NutritionFacts.Builder(240, 8)
                        .calories(100)
                        .sodium(35)
                        .carbohydrate(27)
                        .build();
        System.out.println(cocaCola);
        NyPizza pizza =
                new NyPizza.Builder(NyPizza.Size.SMALL)
                        .addTopping(Pizza.Topping.SAUSAGE)
                        .addTopping(Pizza.Topping.ONION)
                        .build();
        System.out.println(pizza);
        Calzone calzone =
                new Calzone.Builder()
                        .addTopping(Pizza.Topping.HAM)
                        .sauceInside()
                        .build();
        System.out.println(calzone);
    }
}
