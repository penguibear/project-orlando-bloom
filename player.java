public class player{

	int STAT_ATK, STAT_DEF, STAT_PER, STAT_SCV, STAT_MED;
	float KARMA;
	String NAME;
	boolean isAlive;
	public player(String inName){

	isAlive = true;

	this.STAT_ATK = 1;		// attack - for the obvious reasons
	this.STAT_DEF = 1;		//defence - again, obvious

	this.STAT_PER = 1;		//perception - determines how well you notice enemies and weaknesses and such
	this.STAT_SCV = 1;		//scavenging - your car breaks down, you have a skill to use scrap metal to fix the engine
	this.STAT_MED = 1;		//medical skill - allows you to better heal yourself / others

	this.KARMA = 50;

	this.NAME = inName;
	}


}
