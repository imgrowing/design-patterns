package visitor.document_ex;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import visitor.document_ex.api.Element;
import visitor.document_ex.api.Visitor;
import visitor.document_ex.element.Document;
import visitor.document_ex.element.JsonElement;
import visitor.document_ex.element.XmlElement;
import visitor.document_ex.visitor.ElementPrinter;
import visitor.document_ex.visitor.ElementVisitor;

import java.util.List;

@Slf4j
public class App {

	public static void main(String[] args) {
		List<Element> elements = Lists.newArrayList(
			new JsonElement(),
			new JsonElement(),
			new XmlElement(),
			new JsonElement(),
			new XmlElement()
		);

		Element document = new Document(elements);

		Visitor visitor = new ElementVisitor();
		Visitor printer = new ElementPrinter();

		log.warn("Visit elements");
		document.accept(visitor);

		log.warn("Print elements");
		document.accept(printer);
	}

}
