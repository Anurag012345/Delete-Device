public interface ANetwork {
    public void setConnectionList(Connection cn);
    public Device getTarget(Connection cn);
    public Device getSource(Connection cn);
}

