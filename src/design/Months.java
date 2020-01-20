package design;


class test{
public enum Months {
    January, February, March, April, May, June, July, August, September, October, November, December

}

    public static void main(String[] args) {
        Months m = Months.February;
        System.out.println(m +"This is a carnival month");


        switch(m) {
            case February:
                System.out.println("Cold");
                break;
            case December:
                System.out.println("Cold and Christmas is coming");
                break;
            case July:
                System.out.println("Hot and this is Summer time");
                break;

        }

    }
    }