import java.util.ArrayList;

public class ArrayListTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList teamPersonList  = new ArrayList<TeamPerson>();
//		ArrayList<TeamPerson> teamPersonList  = new ArrayList<TeamPerson>();
		ArrayList<TeamPerson> teamPersonList  = new ArrayList();
		
		TeamPerson tp = new TeamPerson(1, "장훈일", 30);
		TeamPerson tp2 = new TeamPerson(2, "김충현", 25); 
		
		teamPersonList.add(tp);
		teamPersonList.add(tp2);
		
		
		for (int i = 0; i < teamPersonList.size(); i++) {
			teamPersonList.get(i).printInfo();
			System.out.println();
		}
				
		TeamPerson tempTeamPerson = null;
		int tempAge = 0;
		for (int i = 0; i < teamPersonList.size(); i++) {
			tempTeamPerson = teamPersonList.get(i);
			tempAge = tempTeamPerson.getAge();
			
			teamPersonList.get(i).setAge(tempAge + 1);
		}
		
		for (int i = 0; i < teamPersonList.size(); i++) {
			teamPersonList.get(i).printInfo();
			System.out.println();
		}
		
		
		
		
	}

}
