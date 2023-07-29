public class DuplicateInArray {
    public static void main(String[] args) {
        int []a = {10,20,202,20,10,203203,21212};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i] == a[j]) && (i !=j)){
                    System.out.println(a[j]);
                }
            }
        }
    }
}
