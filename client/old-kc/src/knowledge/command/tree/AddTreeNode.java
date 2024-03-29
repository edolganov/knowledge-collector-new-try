package knowledge.command.tree;

import knowledge.core.command.Command;
import ru.kc.model.knowledge.Element;
import ru.kc.model.knowledge.Link;
import util.Util;

public class AddTreeNode extends Command<Void> {

	
	Element parent, node;
	

	public AddTreeNode(Element parent, Element node) {
		super();
		this.parent = parent;
		this.node = node;
	}

	@Override
	public Void doAction() {
		if(parent == null || node == null) return null;
		if(node instanceof Link){
			Link l = (Link) node;
			String name = l.getName();
			String url = l.getUrl();
			if(Util.isEmpty(name)){
				l.setName(url);
			}
			else if(Util.isEmpty(url)){
				l.setUrl(name);
			}
		}
		
		
		appContext.getPersist().addChild(parent,node);
		return null;
	}

}
