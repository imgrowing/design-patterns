package visitor.document_ex.element;

import visitor.document_ex.api.Element;
import visitor.document_ex.api.Visitor;

import java.util.UUID;

public class XmlElement implements Element {

	private String uuid;

	public XmlElement() {
		this.uuid = UUID.randomUUID().toString();
	}

	@Override
	public String getUuid() {
		return uuid;
	}

	@Override
	public String getContent() {
		return "<uuid>" + getUuid() + "</uuid>";
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
