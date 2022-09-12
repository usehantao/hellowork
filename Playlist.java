import java.util.ArrayList;

class Playlist{
	
	public static void main(String[]args) {
		
		
		ArrayList<String>desertIslandPlaylist = new ArrayList<String>();
		
		desertIslandPlaylist.add("wobuxiangzhangda");
		
		desertIslandPlaylist.add("haikuotiankong");
		
		desertIslandPlaylist.add("houlai");
		
		desertIslandPlaylist.add("shinian");
		
		desertIslandPlaylist.add("liyifeng");
		
		desertIslandPlaylist.add("shengrige");
		
		desertIslandPlaylist.remove("wobuxiangzhangda");
		
		int indexA = desertIslandPlaylist.indexOf("haikuotiankong");
		
		int indexB = desertIslandPlaylist.indexOf("shengrige");
		
		String tempA="haikuotiankong";
		
		desertIslandPlaylist.set(indexA, "haikuotiankong");
		
		
		desertIslandPlaylist.set(indexB, tempA);
		
		
		
	
		
		
		
		System.out.println(desertIslandPlaylist.size());
		
		
		System.out.println(desertIslandPlaylist);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

