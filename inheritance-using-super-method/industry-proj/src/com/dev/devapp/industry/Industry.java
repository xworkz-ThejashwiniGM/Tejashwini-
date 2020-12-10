package com.dev.devapp.industry;

public class Industry {
		public String type;
		public int noOfWorkers;
		public String area;
		
		public Industry(String type,int noOfWorkers,String area) {
			this.type=type;
			this.noOfWorkers=noOfWorkers;
			this.area=area;
		}
		
		

		public String production() {
			return "producing";
		}

	}


