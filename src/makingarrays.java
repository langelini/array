public class makingarrays {
    int [] nums = new int[10];
    public static void main(String[] args) {

        System.out.println("Hello World!");
        makingarrays make = new makingarrays();

    }


    public makingarrays() {
        System.out.println("welcome to array world");
        nums[1] = 5;
        nums[0] = 10;
        nums[2] = 15                                                                                                                                               ;
        nums [ 2 ] = nums[1]*3;
        nums  [3] = 20;
        nums  [4] = 25;
        nums  [5] = 30;
        nums  [6] = 35;
        nums  [7] = 40;
        nums  [8] = 45;
        nums  [9] = 50;

        printarray();
    }
    public void printarray(){
        System.out.println(nums[1]);
        System.out.println(nums[0]);
        System.out.println(nums[2]);
    }

}