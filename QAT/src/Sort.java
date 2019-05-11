
public class Sort {

	public static void main(String[] args) {
		int[] valid = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] Sort = new int[5];
		if (args.length!=5) {
			System.out.println("Invalid arguments number");
			System.exit(1);
		}
		Sort[0]=Integer.parseInt(args[0]);
		Sort[1]=Integer.parseInt(args[1]);
		Sort[2]=Integer.parseInt(args[2]);
		Sort[3]=Integer.parseInt(args[3]);
		Sort[4]=Integer.parseInt(args[4]);
		for (int i : valid) if (i==Sort[0]) {
			for (int j : valid) if (j==Sort[1]) {
				for (int k : valid) if (k==Sort[2]) {
					for (int l : valid) if (l==Sort[3]) {
						for (int m : valid) if (m==Sort[4]) {
							System.out.println("Array before sort: ["+args[0]+", "+args[1]+", "+args[2]+", "+args[3]+", "+args[4]+"]");
							boolean buble=true;
							int exch;
							while (buble) {
								buble = false;
								for (int n=0; n<4; ++n) {
									if (Sort[n]>Sort[n+1]) {
										exch=Sort[n];
										Sort[n]=Sort[n+1];
										Sort[n+1]=exch;
										buble=true;
									}
								}			
							}
							System.out.println("Array after sort: ["+Sort[0]+", "+Sort[1]+", "+Sort[2]+", "+Sort[3]+", "+Sort[4]+"]");							
							System.exit(0);
						} 
					}
				}
			}
		} 
		System.out.println("Invalid arguments");
		System.exit(1);
	}
}
