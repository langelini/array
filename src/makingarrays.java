public class makingarrays {
    int [] nums = new int[(int)(1000000 * Math.random())];
    public double total;
    public static void main(String[] args) {

        System.out.println("Hello World!");
        makingarrays make = new makingarrays();

    }


    public makingarrays() {
        System.out.println("welcome to array world");
        printarray();
    }
    public void printarray() {
        for (int x = 0; x < nums.length; x++) {
            nums[x] = (int) (100 * Math.random());
        }
        for (int x = 0; x < nums.length; x++) {
            System.out.println(nums[x]);
        }
        for (int x = 0; x < nums.length; x++) {
            total = total+nums[x];
        }
        System.out.println("this is the total: "+total);
        System.out.println("this is the AVG: "+total /nums.length);
    }


}