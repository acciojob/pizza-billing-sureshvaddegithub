package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;

    private int topingsPrice;

    private int takeawayPrice;

    private boolean addExtraCheese;

    private boolean addExtraToppings;

    private boolean addTakeAway;

    private boolean isBillGeneration;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        this.cheesePrice = 80;
        this.takeawayPrice = 20;

        if(isVeg == true){
            this.price = 300;
            this.topingsPrice = 70;
        }
        else{
            this.price = 400;
            this.topingsPrice = 120;
        }

        this.addExtraCheese = false;
        this.addTakeAway = false;
        this.addExtraToppings = false;
        this.isBillGeneration = false;
        this.bill = "Base Price Of The Pizza: " + this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
       if(addExtraCheese==false){
           this.price = this.price+this.cheesePrice;
           addExtraCheese = true;
       }
    }

    public void addExtraToppings(){
        if(addExtraToppings == false) {
            this.price = this.price + this.topingsPrice;
            addExtraToppings = true;
        }
    }

    public void addTakeaway(){
       if(addTakeAway == false){
           this.price = this.price+this.takeawayPrice;
           addTakeAway = true;
       }
    }

    public String getBill(){
         if(isBillGeneration == false){
             if(addExtraCheese==true){
                 this.bill += "Extra Cheese Added: "+this.cheesePrice+"\n";
             }
             if(addExtraToppings == true) {
                 this.bill += "Extra Toppings Added: " + this.topingsPrice + "\n";
             }
             if(addTakeAway == true){
                 this.bill += "Paperbag Added: "+this.takeawayPrice+"\n";
             }
             this.bill+="Total Price: "+this.price+"\n";
             isBillGeneration = true;
         }
        return this.bill;
    }
}
