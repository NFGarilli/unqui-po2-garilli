package tp8_TemplateMethodYAdapter_Ej3_ElementosSimilares;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {
	
	public String getTitle();
	
	public List<WikipediaPage> getLinks();
	
	public Map<String, WikipediaPage> getInfobox();
	
}