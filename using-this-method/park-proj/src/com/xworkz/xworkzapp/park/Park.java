package com.xworkz.xworkzapp.park;

public class Park {
   public String name;
  public  String area;
  public String address;
  public  int totalparks;
    
    public Park() {
	this("kagepark","mgRoad",23);//in order to print this() v need to create obj for dat particular this method and use syso
		System.out.println(this.name+" "+this.area+" "+this.totalparks);
		
	}
    public Park(String address)// to print parameterized contructor need to create obj of one parameter 
    {
    this("tejupark","Harapanahalli",20);	
   this.address=address;
   //System.out.println(this.address);
	System.out.println(this.name+" "+this.area+" "+this.totalparks);

    }
    
    public Park(String cname, String carea,int ctotalparks) {
    	name=cname;
    	area=carea;
    	totalparks=ctotalparks;
    	
    }
    
}
