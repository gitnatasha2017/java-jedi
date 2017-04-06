package model;

import static org.junit.Assert.*;
import org.junit.*;


public class SubSystemTest {
	@Test
	public void checkSubsystemNotDamagedWhenCreated(){
		SubSystem subsys = new SubSystem();
		assertFalse(subsys.isDamaged());
	}
	
	@Test
	public void checkSubSystemDamagedWhenDamaged(){
		SubSystem subsys = new SubSystem();
		subsys.setDamaged();
		assertTrue(subsys.isDamaged());
		
	}
	
	@Test
	public void checkSubSystemRepaired(){
		SubSystem subsys = new SubSystem();
		subsys.setDamaged();
		assertTrue(subsys.isDamaged());
		subsys.repair();
		assertFalse(subsys.isDamaged());
		
		
	}
}
