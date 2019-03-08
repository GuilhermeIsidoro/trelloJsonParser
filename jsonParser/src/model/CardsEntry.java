package model;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonProperty;

public class CardsEntry {
	@JsonProperty("descData") private Object descData;
	@JsonProperty("attachments") private ArrayList<Attachments> attachments;
	@JsonProperty("idLabels") private ArrayList<String> idLabels;
	@JsonProperty("shortUrl") private String shortUrl;
	@JsonProperty("dueComplete") private Boolean dueComplete;
	@JsonProperty("dateLastActivity") private String dateLastActivity;
	@JsonProperty("idList") private String idList;
	@JsonProperty("idMembersVoted") private ArrayList<String> idMembersVoted;
	@JsonProperty("shortLink") private String shortLink;
	@JsonProperty("creationMethod") private Object creationMethod;
	@JsonProperty("subscribed") private Boolean subscribed;
	@JsonProperty("pos") private Double pos;
	@JsonProperty("idChecklists") private ArrayList<String> idChecklists;
	@JsonProperty("pluginData") private ArrayList<String> pluginData;
	@JsonProperty("id") private String id;
	@JsonProperty("limits") private Limits limits;
	@JsonProperty("email") private String email;
	@JsonProperty("customFieldItems") private ArrayList<String> customFieldItems;
	@JsonProperty("address") private Object address;
	@JsonProperty("idBoard") private String idBoard;
	@JsonProperty("locationName") private Object locationName;
	@JsonProperty("coordinates") private Object coordinates;
	@JsonProperty("checkItemStates") private Object checkItemStates;
	@JsonProperty("url") private String url;
	@JsonProperty("labels") private ArrayList<Labels> labels;
	@JsonProperty("badges") private Badges badges;
	@JsonProperty("idMembers") private ArrayList<String> idMembers;
	@JsonProperty("idShort") private Integer idShort;
	@JsonProperty("due") private Object due;
	@JsonProperty("idAttachmentCover") private Object idAttachmentCover;
	@JsonProperty("name") private String name;
	@JsonProperty("closed") private Boolean closed;
	@JsonProperty("manualCoverAttachment") private Boolean manualCoverAttachment;
	@JsonProperty("desc") private String desc;
	public Object getDescData() {
		return descData;
	}
	public void setDescData(Object descData) {
		this.descData = descData;
	}
	public ArrayList<Attachments> getAttachments() {
		return attachments;
	}
	public void setAttachments(ArrayList<Attachments> attachments) {
		this.attachments = attachments;
	}
	public ArrayList<String> getIdLabels() {
		return idLabels;
	}
	public void setIdLabels(ArrayList<String> idLabels) {
		this.idLabels = idLabels;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public Boolean getDueComplete() {
		return dueComplete;
	}
	public void setDueComplete(Boolean dueComplete) {
		this.dueComplete = dueComplete;
	}
	public String getDateLastActivity() {
		return dateLastActivity;
	}
	public void setDateLastActivity(String dateLastActivity) {
		this.dateLastActivity = dateLastActivity;
	}
	public String getIdList() {
		return idList;
	}
	public void setIdList(String idList) {
		this.idList = idList;
	}
	public ArrayList<String> getIdMembersVoted() {
		return idMembersVoted;
	}
	public void setIdMembersVoted(ArrayList<String> idMembersVoted) {
		this.idMembersVoted = idMembersVoted;
	}
	public String getShortLink() {
		return shortLink;
	}
	public void setShortLink(String shortLink) {
		this.shortLink = shortLink;
	}
	public Object getCreationMethod() {
		return creationMethod;
	}
	public void setCreationMethod(Object creationMethod) {
		this.creationMethod = creationMethod;
	}
	public Boolean getSubscribed() {
		return subscribed;
	}
	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;
	}
	public Double getPos() {
		return pos;
	}
	public void setPos(Double pos) {
		this.pos = pos;
	}
	public ArrayList<String> getIdChecklists() {
		return idChecklists;
	}
	public void setIdChecklists(ArrayList<String> idChecklists) {
		this.idChecklists = idChecklists;
	}
	public ArrayList<String> getPluginData() {
		return pluginData;
	}
	public void setPluginData(ArrayList<String> pluginData) {
		this.pluginData = pluginData;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Limits getLimits() {
		return limits;
	}
	public void setLimits(Limits limits) {
		this.limits = limits;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<String> getCustomFieldItems() {
		return customFieldItems;
	}
	public void setCustomFieldItems(ArrayList<String> customFieldItems) {
		this.customFieldItems = customFieldItems;
	}
	public Object getAddress() {
		return address;
	}
	public void setAddress(Object address) {
		this.address = address;
	}
	public String getIdBoard() {
		return idBoard;
	}
	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}
	public Object getLocationName() {
		return locationName;
	}
	public void setLocationName(Object locationName) {
		this.locationName = locationName;
	}
	public Object getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Object coordinates) {
		this.coordinates = coordinates;
	}
	public Object getCheckItemStates() {
		return checkItemStates;
	}
	public void setCheckItemStates(Object checkItemStates) {
		this.checkItemStates = checkItemStates;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ArrayList<Labels> getLabels() {
		return labels;
	}
	public void setLabels(ArrayList<Labels> labels) {
		this.labels = labels;
	}
	public Badges getBadges() {
		return badges;
	}
	public void setBadges(Badges badges) {
		this.badges = badges;
	}
	public ArrayList<String> getIdMembers() {
		return idMembers;
	}
	public void setIdMembers(ArrayList<String> idMembers) {
		this.idMembers = idMembers;
	}
	public Integer getIdShort() {
		return idShort;
	}
	public void setIdShort(Integer idShort) {
		this.idShort = idShort;
	}
	public Object getDue() {
		return due;
	}
	public void setDue(Object due) {
		this.due = due;
	}
	public Object getIdAttachmentCover() {
		return idAttachmentCover;
	}
	public void setIdAttachmentCover(Object idAttachmentCover) {
		this.idAttachmentCover = idAttachmentCover;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getClosed() {
		return closed;
	}
	public void setClosed(Boolean closed) {
		this.closed = closed;
	}
	public Boolean getManualCoverAttachment() {
		return manualCoverAttachment;
	}
	public void setManualCoverAttachment(Boolean manualCoverAttachment) {
		this.manualCoverAttachment = manualCoverAttachment;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
