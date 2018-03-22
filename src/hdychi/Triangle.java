package hdychi;

public class Triangle {
    public static int getType(int a,int b,int c){
        if(a == b && b == c){
            System.out.println(1);
            return 1;
        }
        else{
            if(a == b){
                if(a + b > c){
                    System.out.println(2);
                    return  2;
                }
            }
            else if(b == c){
                if(b + c > a){
                    System.out.println(2);
                    return 2;
                }
            }
            else if(a == c){
                if(a + c > b){
                    System.out.println(2);
                    return 2;
                }
            }
        }
        if(a + b > c && Math.abs(a - b) < c){
            System.out.println(3);
            return 3;
        }
        System.out.println(4);
        return 4;
    }
}
