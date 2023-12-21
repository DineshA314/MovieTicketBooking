
public class rotateRight_46 {
public static void main(String[] args) {
	int a[] = {1,2,3,4,5,6};
	int num =2;
	for(int i=a.length-num;i<a.length;i++) {
		System.out.print(a[i]);
	}
	for(int i=0;i<a.length-num;i++) {
		System.out.print(a[i]);
	}
}
}
