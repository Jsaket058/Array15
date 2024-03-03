import java.util.*;

class Array34{
	boolean twoSum(int arr[],int target){
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		while(left<right){
			int sum=arr[left]+arr[right];
			if(sum==target)return true;
			else if(sum>target)right--;
			else left++;
		}
		return false;
	}
}
class Run{
	public static void main(String[] args){
		Array34 a=new Array34();
		int x[]={2,6,5,8,11};
		int target=13;
		int target2=20;
		System.out.println(a.twoSum(x,target));
		System.out.println(a.twoSum(x,target2));
	}
}