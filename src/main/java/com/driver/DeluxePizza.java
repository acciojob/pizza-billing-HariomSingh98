package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);//to call pizza constructor
        addExtraCheese();
        addExtraToppings();

        // your code goes here
    }
}
