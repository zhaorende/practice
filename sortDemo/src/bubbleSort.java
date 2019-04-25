/**
 * Created by 赵人德 on 2019-04-12.
 */
public class bubbleSort {
   public static void main(String[] arg){
       long starttime=System.currentTimeMillis();
       int[] a={13,343,565,8674,454,34,64,657,2,54,546,345,454,13,343,565,8674,454,34,64,657,2,54,546,345,454};
       for(int i=0;i<a.length-1;i++){
           for(int j=0;j<a.length-i-1;j++){
               if(a[j]<a[j+1]){
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }
       }
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
       long endtime=System.currentTimeMillis();
       System.out.print("程序运行时间："+(endtime-starttime)+"ms");
   }
}
