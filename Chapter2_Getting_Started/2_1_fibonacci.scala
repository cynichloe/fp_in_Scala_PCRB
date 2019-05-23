def myFibo(n: Int): Int = {

	@annotation.tailrec
	def helper(prev: Int, current: Int, count: Int): Int={

		if (n == 1) {
			0;
		}
		else if (n == 2) {
			1;
		}
		else if (n < 1) {
			0;
		}
		else if (count < n) {
			helper(current, prev+current, count + 1);
		}
		else {
			current + prev;
		}
	}
	// helper(0, 1, n)
	helper(0,1,n)
}