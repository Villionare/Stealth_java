package ZERO.Tester;

public class TeamEvent extends Event{
    protected int noOfParticipants;
    protected int teamNo;

    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
        super(eventName, participantName);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    @Override
    void registerEvent(){
        switch (this.eventName) {
            case "Singing" -> this.registrationFees = this.noOfParticipants * 4;
            case "Dancing" -> this.registrationFees = this.noOfParticipants *6;
            case "DigitalArt" -> this.registrationFees = this.noOfParticipants *8;
            case "Acting" -> this.registrationFees = this.noOfParticipants *10;
            default -> this.registrationFees = 0;
        }
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }
}
