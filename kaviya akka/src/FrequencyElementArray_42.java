
public class FrequencyElementArray_42 {
public static void main(String[] args) {
	int sum=1;
	int a[]= {1,2,1,3,1};
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if((a[i]==a[j])&&(a[j]!='*')) {
				sum += 1;
				a[j]='*';
			}
		}
		System.out.println(a[i]+" = "+sum);
		sum=1;
	}
}
}
