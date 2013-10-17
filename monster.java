public class monster{
	int ATK, DEF, HP;
	String NAME;

	public monster(String inName, int inATK, int inDEF, int inHP){
		NAME = inName;
		ATK = inATK;
		DEF = inDEF;
		HP = inHP;

	}						//This is my class for creating monsters. I should use this for most of the monsters

	public int getATK(){return this.ATK;}
	public int getDEF(){return this.DEF;}
	public int getHP(){return this.HP;}


}
