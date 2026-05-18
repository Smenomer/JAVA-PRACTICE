package smenomer;

public class sorting {
    public static void main(String[] args) {
        int[] num={3,2,0,1};
        int min=num[0];

        int temp=0;
        for (int i = 0; i < num.length; i++) {
            int minindex=i;
            for (int j = i+1; j <num.length ; j++) {
                if(num[j]<num[minindex])
                    minindex=j;

            }
            temp=num[i];
            num[i]=num[minindex];
            num[minindex]=temp;


        }
        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);
        }


    }
}
