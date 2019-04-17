package project_game.model;

public class ReadMaps {
	ReadFromFileAShape fileAShape;
	int mapID;

	public ReadMaps(int mapID) {
		this.mapID = mapID;
	}

	public void setMapID(int mapID) {
		this.mapID = mapID;
	}

	void chooseMap() {

		switch (mapID) {
		case 1:
			fileAShape = new ReadFromFileAShape("src/maps/map1.txt");
		case 2:
			fileAShape = new ReadFromFileAShape("src/maps/map12.txt");
		case 3:
			fileAShape = new ReadFromFileAShape("src/maps/map3.txt");

			break;

		default:
			break;
		}

	}

}
