package visitor.document_ex.visitor;

import lombok.extern.slf4j.Slf4j;
import visitor.document_ex.api.Visitor;
import visitor.document_ex.element.JsonElement;
import visitor.document_ex.element.XmlElement;

@Slf4j
public class ElementVisitor implements Visitor {
	@Override
	public void visit(JsonElement element) {
		log.info("Visiting JsonElement: {}", element.getUuid());
	}

	@Override
	public void visit(XmlElement element) {
		log.info("Visiting XmlElement : {}", element.getUuid());
	}
}
