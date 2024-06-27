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
    
    // Tiling Problem
    public static int TilingProb(int n){
        //basecase
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        int fnm1=TilingProb(n-1);

        int fnm2=TilingProb(n-2);
        int totways=fnm1+fnm1;
        //call innner function
        return totways;

    }
    
    //removing duplicate string charecters
    public static void removeDuplicates(int idx, String str, StringBuilder newstr, boolean map[] ){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicates
            removeDuplicates(idx+1, str, newstr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(idx+1, str, newstr.append(currChar), map);
        }
    }

        //friends pairing problem
        public static int friendsPairing(int n){
            if(n==1||n==2){
                return n;
            }
            //signle
            //choice 
            //int fnm1=friendsPairing(n-1);

            //pair
           //int fnm2= friendsPairing(n-2);
            //int pairways=(n-1)*fnm2;

            //int totways=fnm1+pairways;
            //return totways;
           return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
        }

        //Binary string problem
        public static void BinaryString(int n, int lastplace, String str){
            //base case
            if(n==0){
                System.out.println(str);
                return;
            }
            //kaam
            BinaryString(n-1, 0, str+"0");
            if(lastplace==0){
                BinaryString(n-1, 1, str+"1");
            }
        }

        //the key occurence indices
        public static void allOccurence(int arr[], int key, int i){
            if(i==arr.length){
                return;
            }
            if(arr[i]==key){
                System.out.println(i+"");
            }
            allOccurence(arr, key, i+1);
        }
        static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        //numbers to string
        public static void printDigits(int num){
            if(num==0){
                return;
            }
            int lastDigit=num%10;
            printDigits(num/10);
            System.out.println(digits[lastDigit]+" ");

        }
        
        //string length
        public static int stringLength(String str){
            if(str.length()==0){
                return 0;
            }
            return stringLength(str.substring(1))+1;


        }
    public static void main(String[] args) {
       // int n=2;
       // int arr[]={8,3,2,9,5,10,2,2,2};
        //BinaryString(3,0, "");
        //String str= "appnnacollege";
        //int key=2;
        //allOccurence(arr, key, 0);
        //printDigits(1290);
        String str="abcdefg";
        System.out.println(stringLength(str));
        //removeDuplicates(0, str,new StringBuilder(""), new boolean[26]);
    
    }
}
