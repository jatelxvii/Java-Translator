public class EListUser {
	public static int size1(EList k) {
		EListIt it = k.iterator();
		int count = 0;
		
		while(it.hasNext()) {
			count++;
			it.next();
		}
		return count;
	}

	public static boolean isBalanced(EList k) {
		EListIt it = k.iterator();
		int total =0, left_count = 0, right_count = 0;

		total = EListUser.size1(k);

		//System.out.println(":: k.size ::" + length);

		for(int i = 0; i < total/2; i++) {
			if(it.next() instanceof EInteger)
				left_count++;
		}

		if (total % 2 != 0) //if odd, ignore middle number
			it.next();

		for(int i = total - total/2; i < total; i++) {
			if(it.next() instanceof EInteger)
				right_count++;
		}

		return left_count == right_count;

		//System.out.println(":: left_count "": +left_count);
			
	}

} 


		

