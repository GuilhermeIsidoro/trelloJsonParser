package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class TotalPerBoard {
	@JsonProperty("warnAt") private Integer warnAt;
	@JsonProperty("disableAt") private Integer disableAt;
	@JsonProperty("status") private String status;
}
