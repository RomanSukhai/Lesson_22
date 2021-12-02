package homework2;



public class Costructor {
    public static void main(String[] args) {
        Constructor constructor = (int a) ->a;
        Constructor2 constructor2 = (int a,int b)->a+b;
        Constructor3 constructor3 = (int a,int b,int c)->a+b+c;

        System.out.println(constructor.number(3));
        System.out.println(constructor2.number(2,3));
        System.out.println(constructor3.number(2,3,5));

    }



    interface Constructor{
        int number(int a);
    }
    interface Constructor2{
        int number(int a,int b);
    }
    interface Constructor3{
        int number(int a,int b,int c );
    }


    }


