
@SuppressWarnings({"unused"})
public class Rank {
	private int multiplier = 1;
	private int curr_rank = 1;
	private int max_rank = 10;
	private Name rank_name;
	
	
	
	public Rank() {
		this.rank_name = Name.b;
	}
	
	
	
	public void rankUp() {
		if (this.curr_rank < this.max_rank) {
			this.curr_rank += 1;			
			changeRank();
		}
	}
	
	
	
	public Name getName() {
		return this.rank_name;
	}
	
	
	
	public int getMultiplier() {
		return this.multiplier;
	}
	
	
	
	public void changeRank() {
		switch(this.curr_rank) {
			case 2: {
				this.rank_name = Name.a;
				this.multiplier = 2;
				break;
			}
			
			case 3: {
				this.rank_name = Name.f;
				this.multiplier = 4;
				break;
			}
			
			case 4: {
				this.rank_name = Name.g;
				this.multiplier = 8;
				break;
			}
			
			case 5: {
				this.rank_name = Name.h;
				this.multiplier = 16;
				break;
			}
			
			case 6: {
				this.rank_name = Name.j;
				this.multiplier = 32;
				break;
			}
			
			case 7: {
				this.rank_name = Name.k;
				this.multiplier = 69;
				break;
			}
			
			case 8: {
				this.rank_name = Name.l;
				this.multiplier = 88;
				break;
			}
			
			case 9: {
				this.rank_name = Name.meister_Jude;
				this.multiplier = 187;
				break;
			}
			
			case 10: {
				this.rank_name = Name.Gold_Digger;
				this.multiplier = 420;
				break;
			}
		}
	}
}
