public class arraysobject {
    public static void main(String[] args) {

    }
    burger[] burg = new burger [10];
    public arraysobject (){
        System.out.println("making arrays with objects!");
        for(int x = 0; x<burg.length; x++) {
            burger innout = new burger((Math.random() * 100));
            burg[x] = innout;
        }
        changesizes();
        printArray();
        totalsushi();
    }
    public void printArray(){
        for (burger burger : burg) {
            burger.printinfo();
        }
    }
public void changesizes(){
    for (burger burger : burg) {
        burger.size = (int) (Math.random() * 10) + 10;
    }
}
public void totalsushi() {
        int totalsum = 0;
    for (burger burger : burg) {
        totalsum = totalsum + burger.size;
    }
    System.out.println("total size sum: "+totalsum);
}
}
