package curriculum.d;

public class Character {
	protected String name;
	protected int hp;
	protected int at;
	protected int sp;

	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}

	public boolean isDead() {
		return hp <= 0;
	}

	public int attack(Character target) {
		int damage = this.at;
		target.hp -= damage;
		if (target.hp < 0) {
			target.hp = 0;
		}
		return damage;
	}

	public String status() {
		return name + "(HP:" + hp + "AT:" + at + "SP:" + sp + ")";
	}

}
