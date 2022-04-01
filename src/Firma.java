public class Firma {

	private String name;
	private String adress;
	private int room_number;
	
	public Firma(String name, String adress, int room_number) {
		this.name = name;
		this.adress = adress;
		this.room_number = room_number;
	}
	
	public Firma(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public int getRoomNumber() {
		return room_number;
	}
	
	public void setRoomNumber(int room_number) {
		this.room_number = room_number;
	}
	
	public void getInfoFirma() {
		System.out.printf("%-10s %-15s %-6s", name, adress, room_number);
	}
	
	public void addRoom() {
		
	}
	
}
