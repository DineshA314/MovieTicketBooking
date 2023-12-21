
public class CopyArry_41 {
public static void main(String[] args) {
	int a[]= {2,3,4,5,6,7,8};
	int b[]= new int[10];
	
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
	}
	System.out.print(b[3]);
}
}
