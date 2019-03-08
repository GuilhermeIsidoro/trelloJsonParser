package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class CheckItemsEntry {
	@JsonProperty("pos") private Double pos;
	@JsonProperty("idChecklist") private String idChecklist;
	@JsonProperty("name") private String name;
	@JsonProperty("nameData") private Object nameData;
	@JsonProperty("state") private String state;
	@JsonProperty("id") private String id;
}
