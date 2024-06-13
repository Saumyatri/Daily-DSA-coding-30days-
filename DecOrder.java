public class DecOrder {
  //numbers in decreasing order
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
    System.out.println(n+" ");
    printDec(n-1);
    }

    //numbers in increasing order
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
    System.out.println(n+" ");
    }

    //factorial
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }

    //sum of n natural numbers
    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int snm1=calcSum(n-1);
        int sn=n+snm1;
        return sn;
    }
    
    //FIBONACCI NUMBERS
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm2=fib(n-2);
        int fibnm1=fib(n-1);
        int fbn=fibnm1+fibnm2;
        return fbn;
    }

    // is array sorted or not 
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    // first occurence in array

    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    //last occurence of the number in an array
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    //x to the power of n
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    //optimized x to the power of n with time coplexity as O(logn)
    public static int opPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower = opPower(x, n/2);
        int halfpowersq= halfpower*halfpower;

        // n is odd
        if(n%2!=0){
            halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        //int n=5;
        //int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(opPower(2,5));
    }
}
