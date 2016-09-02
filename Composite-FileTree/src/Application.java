
import component.Component;
import composite.Folder;
import leaf.File;

public class Application {

	public static void main(String[] args) {
		Folder root = new Folder("root");
			Folder game = new Folder("game");
			root.add(game);
				Folder fps = new Folder("fps");
					Folder kor = new Folder("kor");
					fps.add(kor);
						File suddenAttack = new File("서든 어택");
						File specialForce = new File("스페셜 포스");
						kor.add(suddenAttack);
						kor.add(specialForce);
					Folder eng = new Folder("eng");
					fps.add(eng);
						File overWatch = new File("오버 워치");
						eng.add(overWatch);
				Folder rpg = new Folder("rpg");
				game.add(fps);
				game.add(rpg);
			Folder movie = new Folder("movie");
			root.add(movie);
				Folder action = new Folder("action");
				movie.add(action);
					File jasonBone = new File("제이슨 본");
					action.add(jasonBone);
				Folder comedy = new Folder("comedy");
				movie.add(comedy);
					File idiots = new File("세 얼간이");
					comedy.add(idiots);
		show(root);
	}
	
	private static void show(Component component) {
		System.out.println(component.getClass().getName() + " | " + component.getName());
		if ( component instanceof Folder ) {
			for (Component comp : ((Folder) component).getChildren()) {
				show(comp);
			}
		}
	}
}
