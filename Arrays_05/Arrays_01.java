package Arrays_05;

class Arrays_01 {
    public static void main(String[] args){
       // when we want to store items or elements of similar data-type for that we use arrays
       
       // syntax and declaration of array
       // here there are index of the array and it start from 0 to n-1
       int[] arr = new int[10]; //  just for understanding this is like here by writing this one line we have created 10 integer type of variables
      
       // now we will assign or initializing values to each index
       arr[0] = 10;
       arr[1] = 20;
       arr[2] = 30;
       arr[3] = 40;
       arr[4] = 50;

       // printing each elements individually but it is time consuming and lengthy 
       System.out.print(arr[0] + " ");
       System.out.print(arr[1] + " ");
       System.out.print(arr[2] + " ");
       System.out.print(arr[3] + " ");
       System.out.print(arr[4] + " ");


System.out.println(); // just to get new line

       // also we can declare an  array by directly giving values in curly brackets by seperating comma
       int[] arr2 = {10, 20, 30, 40, 50};
       System.out.println(arr[2]); // ----> expected o/p is 30

       // suppose we have stored alot of elements and we want to know the length of array for that we can use length operator
       int n = arr2.length; // with lenght operator we will get lenght of arr2 and it will be stored in n
       System.out.println(n);
    }
}

