public class Connection {
    private Device sourceDevice;
    private Device destinationDevice;
    public static int count = 0;
    private int connectionId;

    public Connection(Device source , Device destination) {
        this.sourceDevice = source;
        this.destinationDevice = destination;
        count++;
        connectionId = count;
    }

    @Override
    public String toString() {
        return "Connection{"+"sourceDevice= "+ sourceDevice+
                ", DestinationDevice="+ destinationDevice +
                ", connectionId= "+ connectionId+'}';
    }

    public int compareTo(Connection other) {
        if((this.sourceDevice.equals(other.sourceDevice))&&
                (this.destinationDevice.equals(other.destinationDevice))&&
                (this.connectionId == other.connectionId)){
            return 1;
        }
        else {
            return 0;
        }
    }
    public Device getDestinationDevice() {
        return destinationDevice;
    }
    public Device getSourceDevice() {
        return sourceDevice;
    }

}
