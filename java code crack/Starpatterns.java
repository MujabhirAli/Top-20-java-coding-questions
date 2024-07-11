package System.out;

public class Starpatterns {
	public static void main(String[] args) {
		
		int n=5;
		
//	5*5 star pattern	
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//	        System.out.print("* ");
//		}
//	        System.out.println();
//		}
	
//	incresing triangle pattern	
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//	        System.out.print("* ");
//		}
//	        System.out.println();
//		}
		
//  decresing triangle pattern	
//		for(int i=1;i<=n;i++) {
//			for(int j=i;j<=n;j++) {
//	        System.out.print("* ");
//		}
//	        System.out.println();
//		}
		
//  right side triangle pattern	(decresing space)
//			for(int i=1;i<=n;i++) {
//				for(int j=i;j<=n;j++) {
//		        System.out.print("  ");
//			}
//				for(int j=1;j<=i;j++) {
//			        System.out.print("* ");
//				}
//		        System.out.println();
//			}		
		
//  right side triangle pattern	(increasing star)
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//	        System.out.print("  ");
//		}
//			for(int j=i;j<=n;j++) {
//		        System.out.print("* ");
//			}
//	        System.out.println();
//		}
		
//  hill pattern triangle
//			for(int i=1;i<=n;i++) {
//				
//				for(int j=1;j<=n-i;j++) {
//		        System.out.print("  ");
//			}
//				for(int j=1;j<i;j++) {
//			        System.out.print("* ");
//				}
//				for(int j=1;j<=i;j++) {
//			        System.out.print("* ");
//				}
//		        System.out.println();
//			}	
		
//  reverse hill pattern triangle
//		for(int i=1;i<=n;i++) {
//			
//			for(int j=1;j<=i;j++) {
//	        System.out.print("  ");
//		}
//			for(int j=i;j<n;j++) {
//		        System.out.print("* ");
//			}
//			for(int j=i;j<=n;j++) {
//		        System.out.print("* ");
//			}
//	        System.out.println();
//		}	
		
//  diamond pattern triangle
			for(int i=1;i<n;i++) {
				
				for(int j=i;j<n;j++) {
		        System.out.print("  ");
			}
				for(int j=1;j<i;j++) {
			        System.out.print("* ");
				}
				for(int j=1;j<=i;j++) {
			        System.out.print("* ");
				}
		        System.out.println();
			}	
            for(int i=1;i<=n;i++) {
				
				for(int j=1;j<i;j++) {
		        System.out.print("  ");
			}
				for(int j=i;j<n;j++) {
			        System.out.print("* ");
				}
				for(int j=i;j<=n;j++) {
			        System.out.print("* ");
				}
		        System.out.println();
	}
}
}