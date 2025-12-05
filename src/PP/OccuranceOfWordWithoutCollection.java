package PP;

public class OccuranceOfWordWithoutCollection {
	public static void main(String[] args) {
		String str = "java is easy and java is powerful";
		String [] words = str.split(" ");
		
		boolean [] visited = new boolean[words.length];
		
		for(int i=0; i<words.length; i++) {
			if(visited[i]) {
				continue;
			}
			int count =1;
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println(words[i] +" => " + count);
		}
	}

}
