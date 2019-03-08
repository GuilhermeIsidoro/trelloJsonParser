package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class LabelsEntry {
	@JsonProperty("idBoard") private String idBoard;
	@JsonProperty("color") private String color;
	@JsonProperty("name") private String name;
	@JsonProperty("id") private String id;
}
