package ua.alevel.ext;

// Поиск количества различных(уникальных) эл-в массива

public class Application {
    public static void main(String[] args) {
        int []arr = {3, 3, 5, 5, 5, 6, 7, 8, 8, 97};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }int uniqueNumber = arr.length;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]) uniqueNumber--;
        }
        System.out.println();
        System.out.println(uniqueNumber);



    }



}


