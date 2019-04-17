package project_game.model;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFileAShape {
	Color color = Color.GRAY;
	List<AShape> shapes;

	public ReadFromFileAShape(String linkMap) {
		shapes = new ArrayList<>();
		try {
			FileReader file = new FileReader(linkMap);
			BufferedReader input = new BufferedReader(file);
			String line;
			while ((line = input.readLine()) != null) {
				String[] split = line.split(":");
				AShape shape = shapeType(split[0], splitBySpace(split[1]));
				shapes.add(shape);
				System.out.println(shape);

			}

		} catch (Exception e) {

		}
	}

	public List<AShape> getShapes() {
		return shapes;
	}

	@Override
	public String toString() {
		return "ReadFromFileAShape [color=" + color + ", shapes=" + shapes + "]";
	}

	public void setColor(Color color) {
		this.color = color;
	}

	AShape shapeType(String type, ArrayList<Integer> values) {
		AShape shape;
		if (type.equals("parallelogram"))
			return shape = new Parallelogram(values.get(0), values.get(1), values.get(2), values.get(3), values.get(4),
					values.get(5), color);

		// without return here

		if (type.equals("triagle"))
			return shape = new Triagle(values.get(0), values.get(1), values.get(2), values.get(3), color);
		return shape = new Square(values.get(0), values.get(1), values.get(2), values.get(3), color);

	}

	ArrayList<Integer> splitBySpace(String line) {
		line = line.trim();
		ArrayList<Integer> result = new ArrayList<>();
		String[] splitLine = line.split("\\s");
		for (String s : splitLine)
			result.add(Integer.parseInt(s));

		return result;
	}

	public static void main(String[] args) {
		ReadFromFileAShape a = new ReadFromFileAShape("src/maps/map1.txt");
		System.out.println(a.getShapes());
	}
}
