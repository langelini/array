public class arraysobject {
    public static void main(String[] args) {
            arraysobject a = new arraysobject();
    }
    burger[] burg = new burger [10];
    public arraysobject (){
        System.out.println("making arrays with objects!");
        for(int x = 0; x<burg.length; x++) {
            burger innout = new burger((Math.random() * 100));
            burg[x] = innout;
        }
        changesizes();
        totalsushi();
        printArray();
    }
    public void printArray(){
        for (int x = 0;x<burg.length;x++) {
            burg[x].printinfo();
        }
    }
public void changesizes(){
    for (int x = 0;x<burg.length;x++) {
        burg[x].size = (int) (Math.random() * 10) + 10;
    }
}
public void totalsushi() {
        int totalsum = 0;
    for (int x = 0;x<burg.length;x++) {
        totalsum = totalsum + burg[x].size;
    }
    System.out.println("total size sum: "+totalsum);
}
}
