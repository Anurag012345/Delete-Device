public class MainApp {
    public static void main(String[] args) {
        Device d1 = new Device("SmartWatch");
        Device d2 = new Device("SmartPhone");
        Device d3 = new Device("SmartGlass");
        Device d4 = new Device("SmartTV");
        Device d5 = new Device("Alexa");
        Device d6 = new Device("SmartWatch");
        Device d7 = new Device("SmartPhone");
//        Data da1 = new Data("Hello");
//        d1.setData(da1);

        Connection c0 = new Connection(d1,d2);
        Connection c1 = new Connection(d2,d3);
        Connection c2 = new Connection(d3,d4);
        Connection c3 = new Connection(d4,d5);

        CNetwork a = new CNetwork();

        a.setConnectionList(c0);
        a.setConnectionList(c1);
        a.setConnectionList(c2);
        a.setConnectionList(c3);

        a.connectedDevice(c0);
        a.connectedDevice(c1);
        a.connectedDevice(c2);
        a.connectedDevice(c3);

        a.addDevice(d1);
        a.addDevice(d2);
        a.addDevice(d3);
        a.addDevice(d4);
        a.addDevice(d5);
        a.addDevice(d6);
//        a.addDevice(d7);
//        a.dataTransfer(d1,d4);
//

//        System.out.println(d3.getData());
        for (Connection div: a.connectionList) {
            System.out.print(div+" , ");
        }
//        for (Device div: a.deviceList) {
//            System.out.print(div+" , ");
//        }
        a.deleteDevice(d2);
        System.out.println();
        System.out.println("After delete a device");
//        for (Device div: a.deviceList) {
//            System.out.print(div+" , ");
//        }
        System.out.println();
        for (Connection div: a.connectionList) {
            System.out.print(div+" , ");
        }
////        for (Connection div: a.connectionList) {
////            System.out.print(div+" , ");
////        }

    }
}
