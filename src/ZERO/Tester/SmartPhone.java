package ZERO.Tester;

public class SmartPhone extends Mobile implements Testable{
    
    private String networkGeneration;

    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
      super(name, brand, operatingSystemName, operatingSystemVersion);
      this.networkGeneration = networkGeneration;
    }

    public void setNetworkGeneration(String networkGeneration) {
        this.networkGeneration = networkGeneration;
    }

    public String getNetworkGeneration() {
        return networkGeneration;
    }

    public boolean testCompatibility(){
        return this.getOperatingSystemName().equals("Saturn") || this.getOperatingSystemName().equals("Gara");
    }
}
