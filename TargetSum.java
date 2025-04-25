public class TargetSum {
    static class Result {
        int i, j;
    }
    
    public static void main(String[] args) {
        int target = 36;
        int arr[] = {12, 6, 24, 18, 8, 10, 14, 16, 4};
        Result obj = new Result();
        obj = findTargetSum(target, arr);
        if(obj.i == -1 || obj.j == -1) System.out.println("No elements add up to the target");
        else System.out.println("Elements at indices at " + obj.i + " and at " + obj.j + " add upto " + target);
    }
    
    public static Result findTargetSum(int target, int[] arr) {
        Result temp = new Result();
        temp.i = temp.j = -1;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    temp.i = i;
                    temp.j = j;
                    return temp;
                }
            } 
        }
        return temp;
    }
}
