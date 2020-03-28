package visitor.document_ex.element;

import visitor.document_ex.api.Element;
import visitor.document_ex.api.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Document implements Element {

	private String uuid;

	private List<Element> elements = new ArrayList<>();

	public Document(List<Element> elements) {
		this.uuid = UUID.randomUUID().toString();
		this.elements.addAll(elements);
	}

	@Override
	public String getUuid() {
		return uuid;
	}

	@Override
	public String getContent() {
		return "<document></document>";
	}

	@Override
	public void accept(Visitor visitor) {
		elements.forEach(e -> e.accept(visitor));
	}
}
