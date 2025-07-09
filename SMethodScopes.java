class Scope{
    int a =10;  //member variables

    int b=20;
    // class level scope
    int add(){
        int p =100;
        int q=10;
        return p+q;
    }

    //method level scope 
    int  sub(){
        return p-q; //  error bcz the declerd in other method i.e add
    }

    //block level scope
    void demo(){
    int y=10;

        {
            int x=10;
        }
        System.out.println(y);  // no error
        System.out.println(x);  // error because it decled in block and accesing outside the block
    }
}

public class SMethodScopes {
    public static void main(String[] args) {
        
    }
}
