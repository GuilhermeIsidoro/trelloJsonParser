package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class Reactions {
	@JsonProperty("perAction") private PerAction perAction;
	@JsonProperty("uniquePerAction") private UniquePerAction uniquePerAction;
}
