package knowledge.persist.fs.model;

import model.knowledge.Root;
import model.knowledge.RootElement;

public interface INodeManager<T extends RootElement> {
	
	/**
	 * Получить путь до папки содержащей файл 'data.xml' данного элемента
	 * @param node
	 * @return
	 */
	String getDirPath(T node);

	void move(Root oldRoot, T node);


}
