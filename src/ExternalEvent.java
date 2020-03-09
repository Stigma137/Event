

public interface ExternalEvent {
	abstract String description;
	
	EventType getType() {}
	void setType(EventType et) {}
}
