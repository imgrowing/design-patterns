package visitor.document_ex.api;

import visitor.document_ex.element.JsonElement;
import visitor.document_ex.element.XmlElement;

public interface Visitor {
	void visit(JsonElement element);
	void visit(XmlElement element);
}
