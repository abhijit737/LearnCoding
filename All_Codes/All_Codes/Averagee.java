class Averagee{
    public static void main(String[] args) {
        int phy [] = {10,20,30,40,50};
        int sum =0 ;
        for(int element:phy){
            sum = sum+element;
        }
        System.out.println("The average is:"+sum/phy.length);
    }
}