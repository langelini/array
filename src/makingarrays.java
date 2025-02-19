public class makingarrays {
    int [] nums = new int[3];
    public static void main(String[] args) {

        System.out.println("Hello World!");
        makingarrays make = new makingarrays();

    }


    public makingarrays() {
        System.out.println("welcome to array world");
        nums[1] = 5;
        nums[0] = 10;
        nums[2] = 15                                                                                                                                               ;
        nums [ 2 ] = nums[1]*3                                                                                                                                              ;
        printarray();
    }
    public void printarray(){
        System.out.println(nums[1]);
        System.out.println(nums[0]);
        System.out.println(nums[2]);
    }

}