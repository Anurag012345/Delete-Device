import java.util.*;

public class CNetwork implements ANetwork {
    public List<Device> deviceList;
    public List<Connection> connectionList;//Network
    public List<Device> connectedDeviceList;
    public CNetwork() {
        connectionList = new ArrayList();
        deviceList = new ArrayList<>();
        connectedDeviceList = new ArrayList<>();
    }
    public void addDevice(Device dev) {
        deviceList.add(dev);
    }
    @Override
    public String toString() {
        return "Network{" + "connectionList=" + connectionList + '}';
    }
    @Override
    public void setConnectionList(Connection cn) {
        connectionList.add(cn);
    }
    @Override
    public Device getTarget(Connection cn) {
        return cn.getDestinationDevice();
    }
    @Override
    public Device getSource(Connection cn) {
        return cn.getSourceDevice();
    }
    public void connectedDevice(Connection connection) {
        Device s = getSource(connection);
        Device t = getTarget(connection);
        connectedDeviceList.add(s);
        connectedDeviceList.add(t);
    }
    public boolean checkDevice(Device device) {
        int count = 0;
        for (Device dev : deviceList) {
            if (dev.compareTo(device) == 1) {
                count++;
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkDeviceInNetwork(Device device) {
        int count = 0;
        for (Device d : deviceList) {
            for (Device n : connectedDeviceList) {
                if (d.compareTo(device) == 1 && n.compareTo(device) == 1) {
                    count++;
                }
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
    int count = 0;
    public Connection removeConnection(Device device) {
        for (Connection cn : connectionList) {
            if (getSource(cn).compareTo(device) ==1 || getTarget(cn).compareTo(device)==1) {
                count++;
                return cn;
            }
        }
        return null;
    }


    public void deleteDevice(Device device) {
        if (checkDevice(device) == true) {
            if (checkDeviceInNetwork(device) == true) {
                if (removeConnection(device) != null) {

                    for(int i = 1; i<= count; i++){

                    connectionList.remove(removeConnection(device));
                    }
                    deviceList.remove(device);
                    connectedDeviceList.remove(device);
                }
            } else {
                deviceList.remove(device);
            }
        } else {
            System.out.println("The device didn't exist in network");
        }
    }


//    public void dataTransfer(Device source, Device Destination) {
//        if (checkDeviceInNetwork(source) == true && checkDeviceInNetwork(Destination) == true) {
//            for (Connection cn : connectionList) {
//                if (getSource(cn).compareTo(source)==1)  {
//                    if (getTarget(cn).compareTo(Destination) == 1) {
//                        getTarget(cn).setData(source.getData());
//                        break;
//                    } else {
//                        getTarget(cn).setData(source.getData());
////                        source.removeData();
//                    dataTransfer(getTarget(cn), Destination);
//                    }
//
//                }
//            }
//
//        }
//        else {
//            System.out.println("Cannot Transfer data because device didn't Exist!!!");
//        }
//    }
}

































