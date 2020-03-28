package visitor.document_ex.api;

public interface Element {

	String getUuid();

	String getContent();

	void accept(Visitor visitor);
}
