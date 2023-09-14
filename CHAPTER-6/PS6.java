public class PS6 {
    public static void main(String[] args) {
        
        // question 1
        // float [] marks ={50.5f,49.4f,62.7f,70.2f,68.4f};
        // float sum=0f;
        // by for loop
        // for(int i=0;i<5;i++){
        //     sum= sum+marks[i];
        // }
        // System.out.println(sum);
        // by for each
        // for (float element : marks) {
        //     sum=sum+element;            
        // }
        // System.out.println(sum);

        // question 2
        // float [] marks ={50.5f,49.4f,62.7f,70.2f,68.4f};
        // float num = 70.2f;
        // boolean isInArray=false;
        // method 1
        // for(int i=0;i<5;i++){
        //     if (marks[i]==62.7f) {
        //         System.out.println("yes.The intiger is present in the array");
        //         break;                
        //     }
        //     System.out.println(marks[i]);
        // }
        // method 2
        // for (float element : marks) {
        //     if (num==element) {
        //         isInArray=true;
        //         break;                                
        //     }            
        // }
        // if (isInArray) {
        //     System.out.println("the number is present in the array");
        // } else {
        //     System.out.println("the num is not in the array");
        // }

        // question 3
        // float [] marks ={50.5f,49.4f,62.7f,70.2f,68.4f};
        // float sum=0f;
        // // by for each
        // for (float element : marks) {
        //     sum=(sum+element);            
        // }
        // System.out.println(sum);
        // System.out.println(sum/marks.length);

        // question 4
        // int [][]mat1={{1,2,3},{4,5,6}};
        // int [][]mat2={{7,8,9},{10,11,12}};
        // int [][]result={{0,0,0},{0,0,0}};
        // for(int i=0;i<mat1.length;i++){
        //     for(int j=0;j<mat1[i].length;j++){
        //         System.out.format("i=%d and j=%d",i,j);
        //         result[i][j]=mat1[i][j]+mat2[i][j];
        //     }
        //     System.out.println("");
        // }
        // for(int i=0;i<mat1.length;i++){
        //     for(int j=0;j<mat1[i].length;j++){
        //         System.out.print(result[i][j]+" ");
        //         result[i][j]=mat1[i][j]+mat2[i][j];
        //     }
        //     System.out.println("");
        // }

        // question 5 reversing the array
        // int [] arr={1,2,3,4,5,6};
        // int l=arr.length;
        // int n=Math.floorDiv(l, 2);
        // int temp;
        // for(int i=0;i<n;i++){
        //     // swap a[i] with a[l-1-i]
        //     // a    b   temp
        //     // |3| |4|  | |
        //     temp=arr[i];
        //     arr[i]=arr[l-1-i];
        //     arr[l-1-i]=temp;
        // }
        // for (int element : arr) {
        //     System.out.print(element+" ");
        // }

        // question 6 finding the max value in the array
        // int [] arr={1,2,3,4,48274,5,6,477,84783};
        // int max=Integer.MIN_VALUE;
        // for (int element : arr) {
        //     if(element>max){
        //         max=element;
        //     }
        // }
        //  System.out.print("maximum value in the array is:"+max);

        // question 7 finding the min value in the array
        // int [] arr={1,2,3,4,48274,5,6,477,84783};
        // int min=Integer.MAX_VALUE;
        // for (int element : arr) {
        //     if (element<min) {
        //         min=element;                
        //     }            
        // }
        // System.out.println("minimum value in the array is:"+min);

        // question 8
        // boolean issorted=true;
        // int [] arr={1,2,3,4,48274,5,6,477,84783};
        // for(int i=0;i<arr.length-1;i++){
        //     if (arr[i]>arr[i+1]) {
        //         issorted=false;
        //         break;                
        //     }
        // }
        // if (issorted) {
        //     System.out.println("the array is sorted");            
        // } else {
        //     System.out.println("the array is not sorted");
        // }
        
    }
}
