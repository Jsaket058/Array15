import java.util.*;

class Array33{
	boolean twoSum(int arr[],int target){
		HashMap<Integer,Integer> mpp=new HashMap<>();
		// for(int i=0;i<arr.length;i++){
			// mpp.put(arr[i],i);
		// }
		// for(int i=0;i<arr.length;i++){
			// int temp=arr[i];
			// int x=target-temp;
			// if(mpp.containsKey(x))return true;
		// }
		
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int tx=target-temp;
			if(mpp.containsKey(tx))return true;
			mpp.put(arr[i],i);
		}
		return false;
	}
}
class Run{
	public static void main(String[] args){
		Array33 a=new Array33();
		int x[]={2,6,5,8,11};
		int target=13;
		int target2=20;
		System.out.println(a.twoSum(x,target));
		System.out.println(a.twoSum(x,target2));
	}
}