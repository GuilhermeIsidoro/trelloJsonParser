package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class Cards {
	@JsonProperty("openPerList") private OpenPerList openPerList;
	@JsonProperty("totalPerList") private TotalPerList totalPerList;
	@JsonProperty("totalPerBoard") private TotalPerBoard totalPerBoard;
	@JsonProperty("openPerBoard") private OpenPerBoard openPerBoard;
}
