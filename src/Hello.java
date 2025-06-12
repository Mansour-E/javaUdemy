public class Hello {

    public static void main(String[] args){
        System.out.println("Hello , Hasan");

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 95;
        if (topScore <= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 94;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("You got the low score!");
        }



        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is an true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar != "Volkswagen"; //? false : true;

        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still kid";
        System.out.println("our Client is " + ageText);

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        //challenge

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double thirdValue = (firstValue + secondValue) * 100.00d;
        System.out.println("MyValueTotal = " + thirdValue);
        double theRemainder = thirdValue % 40.00d;
        System.out.println("Remainder = " + theRemainder);
        boolean isNotRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNotRemainder = " + isNotRemainder);

        if (!isNotRemainder){
            System.out.println("Got some remaider");
        }






    }
}
