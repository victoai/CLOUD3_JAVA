package day19;


//   public class Artist extends Object 
public class Artist {

	//멤버변수  (인스턴스 변수)
	int artistCode ;
	String name;
	String agency;
	
	
	public Artist() {
		// TODO Auto-generated constructor stub
	}
	
	public Artist(int artistCode, String name, String agency) {
		super();
		this.artistCode = artistCode;
		this.name = name;
		this.agency = agency;
	}


	public int getArtistCode() {
		return artistCode;
	}


	public String getName() {
		return name;
	}


	public String getAgency() {
		return agency;
	}

	@Override
	public String toString() {
		return "Artist [artistCode=" + artistCode + ", name=" + name + ", agency=" + agency + "]";
	} 
	
	
	
	
}
