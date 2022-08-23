
public class Device {
    private String name;
//    private Data data;
    private int deviceId;
    private static int count = 0;


    public Device(String name) {
        count++;
        this.name = name;
        deviceId = count;
    }
//    public Device(Data data){
//        this.data = data;
//    }
//    public Device(Data data) {
//        count++;
//        deviceId = count;
//    }

//    public void setData(Data data){
//        this.data = data;
//    }
//
//    public Data getData(){
//        return data;
//    }
//
//    public void removeData(){
//        data = null;
//    }

    @Override
    public String toString() {
        return "Device{"
                + "deviceId=" + deviceId + "}";
    }

    public int compareTo(Device other) {
        if (this.deviceId == other.deviceId && this.name.equals(other.name)) {
            return 1;
        } else {
            return 0;
        }
    }
}

