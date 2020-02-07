package com.Class30;

public interface Bank { //define behaviors implement behaviors

	void haveChecking();
	void haveSavings();
}
interface Trustable{
	 void trust();
}

 class BOA implements Bank,Trustable{

	@Override
	public void haveChecking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void haveSavings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		
	}
	
}
class capitalOne implements Bank{

	@Override
	public void haveChecking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void haveSavings() {
		// TODO Auto-generated method stub
		
	}
	
}