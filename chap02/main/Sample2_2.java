package main;
class Sample2_2 {
  public static void main(String[] args) {
    int i ;
    //System.out.println("i        : " + i);

    int[] array = new int[5];
    array[1]=10;
    int[] array1 = new int[5];
   
    array[1]=20;
    array1=array;
    
    
    System.out.println("array[0] : " + array.);
    System.out.println("array[0] : " + array1[1]);
  }
}
