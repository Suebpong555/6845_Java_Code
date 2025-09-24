public class W13_02_basicArray {
    public static void main(String[] args) {
        //การประกาศตัวแปรแบบArray เเบบที่1 ระบุสมาชิกรในวงเล็บปีกกา
        //String[] animals 
        String[] animals = {"Dog", "Cat", "Lion"};
        int dice[] = {1, 2, 3, 4, 5, 6};
        float[] avgScore = {3.50f, 4.00f, 2.75f};

        //หาขนาดของArray
        System.out.println("Size of animals array: " + animals.length);
        
        //การเข้าถึงสมาชิกในArray
        System.out.println("Animal at index 0: " + animals[0]);
        System.out.println("Animal at index 2: " + animals[2]);   

        //วนลูปเเสดงสมาชิกในArray avgeScore
        System.out.print("Show all average scores : ");
        for(int i=0; i<avgScore.length; i++) {
            System.out.print(avgScore[i] + " ");
        }

//==========================================================================       
        
        //การประกาศตัวแปรแบบArray เเบบที่2 ระบุขนาดของArray
        String[] colors = new String[4];
        colors[2] = "Red"; 
        colors[0] = "Green"; 
        colors[3] = "Blue"; 

         System.out.println("Size of colors array : " + colors.length);
         // int j = 1;

         for(int i=0; i<colors.length; i++) {
         System.out.println(" Show all colors : "); 
            System.out.print(colors[i] + " ");  
        }




        
        System.out.println("Size of animals array: " + colors.length);

        System.out.println("Color at index 0: " + colors[0]);
        System.out.println("Color at index 1: " + colors[1]);

        int[] scores = new int[5];
        scores[0] = 50;

        System.out.println("Score at index 4 : " + scores[4]);
   
    }
    
}
