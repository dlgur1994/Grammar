public class Three1 {
	public static void main(String[] args) {
		System.out.println("2μ 4μΉμ: " + square(4));
	}
	
	public static int square(int num) {
		if(num==1)
			return 2;
		else
			return 2*square(num-1);
	}
}
