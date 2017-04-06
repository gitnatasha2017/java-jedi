package model;

public class SubSystem {
	private boolean damaged;
	
	public boolean isDamaged(){
		return damaged;
	}
	
	public void setDamaged(){
		this.damaged = true;
	}

	public void repair() {
		damaged = false;
		
	}
}
