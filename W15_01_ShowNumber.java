public class W15_01_ShowNumber {
    public static void main(String[] args) {
        
        int num [] = new int [100];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 24;
        System.out.println("index [" + i + "] = " + num[i]);
        }
        
        int x = num[49];
        
        System.out.println("================================");
        System.out.println("num at end index = " + num[99]);
        System.out.println("num at no.50 = " + num[49]);
    
    }
    }

