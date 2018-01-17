import java.awt.Image;
import javax.swing.ImageIcon;
public class SmAsteroid extends MovingObject{
	public SmAsteroid() {
		super((float)Math.random()*1920, (float)Math.random()*1000,
		(float)Math.random()*24-12, (float)Math.random()*24-12, 0);
	}
	public SmAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 0);
	}
	public void Break() {
		setExists(false);
	}
}
