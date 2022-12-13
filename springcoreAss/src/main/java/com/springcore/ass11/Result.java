package com.springcore.ass11;

public class Result {
		int maths;
		int hindi;
		int english;
		int science;
		int total;
		
		public Result( int maths, int hindi, int english, int science) {
			super();
			
			this.maths = maths;
			this.hindi = hindi;
			this.english = english;
			this.science = science;
			this.total = maths+hindi+english+science;
		}

		
}
