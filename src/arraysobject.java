public class arraysobject {
    public static void main(String[] args) {
        arraysobject a = new arraysobject();
    }
    burger[] burg = new burger [10];
    public arraysobject (){
        System.out.println("making arrays with objects!");
        burger innout = new burger(142.99);
        for(int x = 0; x<10; x++){
            burg[x] = innout;
            innout.price = (int)(Math.random()*100);
            burg[x].printinfo();
            System.out.println(); // to seperate different burgs

        }
    }
}
