package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class Lists {
	@JsonProperty("totalPerBoard") private TotalPerBoard totalPerBoard;
	@JsonProperty("openPerBoard") private OpenPerBoard openPerBoard;
}
