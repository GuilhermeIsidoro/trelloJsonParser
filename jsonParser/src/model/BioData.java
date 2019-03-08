package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class BioData {
	@JsonProperty("emoji") private Map<String, Object> emoji;
}
