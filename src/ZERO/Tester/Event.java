package ZERO.Tester;

public class Event {
    protected String eventName;
    protected String participantName;
    protected double registrationFees;

    public Event(String eventName, String participantName) {
        this.eventName = eventName;
        this.participantName = participantName;
    }

    void registerEvent(){
        switch (this.eventName) {
            case "Singing" -> this.registrationFees = 8;
            case "Dancing" -> this.registrationFees = 10;
            case "DigitalArt" -> this.registrationFees = 12;
            case "Acting" -> this.registrationFees = 15;
            default -> this.registrationFees = 0;
        }
    }

    public double getRegistrationFee() {
        return registrationFees;
    }

    public String getParticipantName() {
        return participantName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public void setRegistrationFees(double registrationFees) {
        this.registrationFees = registrationFees;
    }
}
