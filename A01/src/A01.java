/**
 * @author ZWH
 */
public class A01 {
    public double max(double... nums){
        double maximum = 0;
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > maximum) {
                    maximum = nums[i];
                }
            }
            return maximum;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        double[] Max = {3,5.2,1};
        A01 a01 = new A01();
        double res = a01.max(Max);
        if (res != 0){
            System.out.println("Max的值为" + res);
        }else {
            System.out.println("数组输入有误");
        }
    }
}
