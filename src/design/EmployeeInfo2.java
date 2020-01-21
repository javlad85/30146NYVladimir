package design;

public abstract class EmployeeInfo2 extends EmployeeInfo {

    static String firstName = "Billy";
    static String lastName = "Wolf";
    static String position = "Supervisor";



    public EmployeeInfo2(){ }

    public EmployeeInfo2(String firstName, String lastName,String position){
        this.firstName = firstName;
    }


    public static void setUShift(){
        System.out.println("An employee must work 40 hours");
    }

    public static void doReport(){
        System.out.println("i am doing a report");
    }



}



