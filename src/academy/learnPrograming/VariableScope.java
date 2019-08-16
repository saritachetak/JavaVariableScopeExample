package academy.learnPrograming;
public class VariableScope {

    static int myGlobalint = 5;

    public static void main(String[] args) {

//        System.out.println(my);

        int myMainLocalint = 10;


        System.out.println(myMainLocalint);
        System.out.println(myGlobalint);
        AnotherVariableScopeClass avsc = new AnotherVariableScopeClass();

        AnotherVariableScopeClass abc = new AnotherVariableScopeClass();
        abc.myStaticGlobalint=0;

        avsc.myStaticGlobalint = 10;

        abc.anotherMethod();



        System.out.println(abc.myStaticGlobalint);

        {
            int myCodeblockInt = 100;
            System.out.println(myCodeblockInt);
        }
//        System.out.println(myCodeblockInt);

        VariableScope vs = new VariableScope();
        vs.myMethod();

    }

    void myMethod(){
        int myLocalInt = 10;


//        System.out.println(myMainLocalint );

        System.out.println(myGlobalint);
    }
}

class AnotherVariableScopeClass{

    int myStaticGlobalint;
    public void anotherMethod(){

    }

}

