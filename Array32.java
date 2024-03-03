class Array32{
	boolean twoSum(int arr[],int target){
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			for(int j=i+1;j<arr.length;j++){
				if((temp+arr[j])==target)return true;
			}
		}
		return false;
	}
}
class Run{
	public static void main(String[] args){
		Array32 a=new Array32();
		int x[]={2,6,5,8,11};
		int target=13;
		int target2=20;
		System.out.println(a.twoSum(x,target));
		System.out.println(a.twoSum(x,target2));
	}
}