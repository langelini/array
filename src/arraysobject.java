public class arraysobject {
    public static void main(String[] args) {
        arraysobject a = new arraysobject();
    }
    burger[] burg = new burger [10];
    public arraysobject (){
        System.out.println("making arrays with objects!");
        burger innout = new burger(142.99);
        burg[0] = innout;
        burg[0].printinfo();
    }
}
