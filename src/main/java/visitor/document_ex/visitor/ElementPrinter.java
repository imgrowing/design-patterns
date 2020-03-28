package visitor.document_ex.visitor;

import lombok.extern.slf4j.Slf4j;
import visitor.document_ex.api.Visitor;
import visitor.document_ex.element.JsonElement;
import visitor.document_ex.element.XmlElement;

@Slf4j
public class ElementPrinter implements Visitor {
	@Override
	public void visit(JsonElement element) {
		log.info("Printing JsonElement: {}", element.getContent());
	}

	@Override
	public void visit(XmlElement element) {
		log.info("Printing XmlElement : {}", element.getContent());
	}
}
