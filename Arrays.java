class ArrayList{
    void demoArrays(){
        int [] ages = new int[3];
        float weights [] = new float[3];
        String [] name = new String[3];

        ages[0] =34;
        ages[1] = 12;
        ages[2] =21;
        // ages[4] =33;

        weights[0] =23.33f;
        weights[1] =80.3f;
         weights[2]= 80;

         System.out.println(ages[0]);
         System.out.println(ages[1]);
         System.out.println(ages[2]);
         System.out.println(ages.length);
         System.out.println(ages.length);
         System.out.println(ages.length);

       }
}

public class Arrays {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.demoArrays();
    }
}
