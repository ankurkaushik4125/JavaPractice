package practice;

public class Song {

	// class variables
	
	 String SongTtitle 	;
	 String ArtistName ;
	
	public void SetTitle(String title)
	{
		
		System.out.println(title); 
	}
	
	public void SetArtistName(String name)
	{
		
		System.out.println(name); 
	}

	public static void main (String aa[])
	
	{
		
		
		Song s = new Song();
		s.SongTtitle= "me pal do pal ka shayar hu";
	    s.ArtistName="Mukesh Kumar";
		// functions
		s.SetTitle(s.SongTtitle);
		s.SetArtistName(s.ArtistName);
		
		Song s1 = new Song();
		
		s1.SongTtitle="Tere mast mast nayan";
		s1.ArtistName="rahat fateh";
		
		
		s1.SetTitle(s1.SongTtitle);
		s1.SetArtistName(s1.ArtistName);
		Album.getUrl("10.5.10.45");
	}
}
