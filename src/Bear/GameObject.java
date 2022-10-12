package Bear;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class GameObject {
	protected int distance; //�̵� �Ÿ�
	protected int x,y;  //���� ��ġ
	
	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		}else {
			return false;
		}

	}
	protected abstract void move();
	protected abstract char getShape();

}
