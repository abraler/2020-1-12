public class exercise {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=b;
        System.out.println(a+"==="+b);


         String name="ABC";
         String namea=Lower(name);
        System.out.println(namea);
    }
    public void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
            int pro=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=pro;
        }
        System.out.print("[");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i<nums.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
    public static String  Lower(String str){
        int length=str.length();
        StringBuilder str1=new StringBuilder();
        for (int i = 0; i <length ; i++) {
            char charget;
            if('A'<=str.charAt(i)&&str.charAt(i)<='Z')
                charget=(char)(str.charAt(i)+32);
            else
                charget=str.charAt(i);
            str1.append(charget);
        }
        return str1.toString();
    }
}
