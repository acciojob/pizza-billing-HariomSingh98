package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;

    private boolean isCheeseAdded;
    private boolean isToppingAddded;
    private boolean isBillCreated;
    private boolean isTakeAwayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.topping =70;
        }
        else{
            this.price= 400;
            this.topping=120;
        }
        this.isToppingAddded=false;
        this.isCheeseAdded=false;
        this.isBillCreated=false;
        this.isTakeAwayAdded=false;

        this.bill = "Base Price Of The Pizza:"+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.price += 80;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAddded){
            this.price += this.topping;
            isToppingAddded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price += 20;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){

        // your code goes here
        if(!isBillCreated){
        if(isCheeseAdded){
            this.bill +="Extra Cheese Added:80"+"\n";
        }
        if(isToppingAddded){
            this.bill += "Extra Toppings Added:"+this.topping +"\n";
        }
        if(isTakeAwayAdded){
            this.bill += "Paperbag Added:20"+"\n";
        }
        this.bill+= "Total Price:"+ this.price;
        isBillCreated= true;
        return this.bill;
        }

        return "";
    }
}
