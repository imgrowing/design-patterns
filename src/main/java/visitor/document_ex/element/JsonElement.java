package visitor.document_ex.element;

import visitor.document_ex.api.Element;
import visitor.document_ex.api.Visitor;

import java.util.UUID;

public class JsonElement implements Element {

	private String uuid;

	public JsonElement() {
		this.uuid = UUID.randomUUID().toString();
	}

	@Override
	public String getUuid() {
		return uuid;
	}

	@Override
	public String getContent() {
		return "{ \"uuid\": \"" + getUuid() + "\"}";
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
