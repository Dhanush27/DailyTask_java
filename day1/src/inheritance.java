class inheritance {
public interface BasketballTeam {
			    public void printBasketballName();
	
			}
			public interface FootballTeam {
			    public void printFootballName();
			}
	
	
	public static class Team implements BasketballTeam, FootballTeam {
			    private String name = null;
	    public Team(String name) {
		
			        this.name = name;
		
			    }
			 public void printFootballName() {
		
			        System.out.println("Football Team: \"" + name +" "+ " F.C.\"");
	    }
				public void printBasketballName() {
	
			        System.out.println("Basketball Team: \"" + name +" "+ " B.C.\"");
			    }
		
			    public static void main(String[] args) {
		
	        Team t = new Team("Manchester united");
		
			        t.printBasketballName();
		
			        t.printFootballName();
			    }
			}
}
