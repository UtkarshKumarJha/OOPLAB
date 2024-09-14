public class Numbers {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for(int i=0;i<10;i++){
            nums[i] = Integer.parseInt(args[i]);
        }
        int pos=0;
        int zero = 0;
        int neg = 0;

        for(int i=0;i<10;i++){
            if(nums[i]>0){
                pos++;
            }else if(nums[i]<0){
                neg++;
            }
            else zero++;
        }
        System.out.print("Numbers of positive numbers: ");
        System.out.println(pos);;
        System.out.print("Numbers of negative numbers: ");
        System.out.println(neg);;
        System.out.print("Numbers of zeros: ");
        System.out.println(zero);
    }
    
}